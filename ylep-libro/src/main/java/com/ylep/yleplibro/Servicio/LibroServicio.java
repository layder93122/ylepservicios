package com.ylep.yleplibro.Servicio;


import com.ylep.yleplibro.Entidad.Libro;

import java.util.List;
import java.util.Optional;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.c;

public interface LibroServicio {

    List<com.ylep.yleplibro.Servicio.Libro> Listar();
    Optional<Libro> Buscar(Long id);
    Libro Guardar(Libro libro);
    Libro Modificar(Long id, Libro libro);
    void Eliminar(Long id);
}
