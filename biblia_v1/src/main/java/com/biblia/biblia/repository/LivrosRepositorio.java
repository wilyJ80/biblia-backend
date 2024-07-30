package com.biblia.biblia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblia.biblia.model.Livros;

public interface LivrosRepositorio extends JpaRepository<Livros, Integer> {
    
}
