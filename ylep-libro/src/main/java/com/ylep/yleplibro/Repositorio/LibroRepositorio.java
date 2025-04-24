package com.ylep.yleplibro.Repositorio;

import com.ylep.yleplibro.Entidad.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
