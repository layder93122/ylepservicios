package com.ylep.yleplibro.Servicio.Implemento;

import com.ylep.yleplibro.Entidad.Libro;
import com.ylep.yleplibro.Repositorio.LibroRepositorio;
import com.ylep.yleplibro.Servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public} class LibroServicioImplemento implements LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    // Listar todos los libros
// Listar todos los libros
    @Override
    public List<Libro> listar() {
        return libroRepositorio.findAll();
    }


    // Buscar un libro por ID
    @Override
    public Optional<Libro> Buscar(Long id) {
        return libroRepositorio.findById(id);
    }

    // Guardar un nuevo libro
    @Override
    public Libro Guardar(Libro libro) {
        return libroRepositorio.save(libro);
    }

    // Modificar un libro existente
    @Override
    public Libro Modificar(Long id, Libro libro) {
        libro.setId(id);
        return libroRepositorio.save(libro);
    }

    // Eliminar un libro por ID
    @Override
    public void Eliminar(Long id) {
        libroRepositorio.deleteById(id);
    }
}
