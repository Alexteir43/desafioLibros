package com.aluracursos.literatura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IdiomaRepository extends JpaRepository {

    Idioma findbyCodigo(String codigo);
}
