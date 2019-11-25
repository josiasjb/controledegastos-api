package com.controledegastos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controledegastos.entidade.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

}
