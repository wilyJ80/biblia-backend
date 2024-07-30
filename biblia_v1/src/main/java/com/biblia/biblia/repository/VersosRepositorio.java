package com.biblia.biblia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblia.biblia.model.Versos;

public interface VersosRepositorio extends JpaRepository<Versos, Integer> {
    
}
