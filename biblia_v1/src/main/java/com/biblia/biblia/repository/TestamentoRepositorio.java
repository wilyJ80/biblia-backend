package com.biblia.biblia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblia.biblia.model.Testamento;

public interface TestamentoRepositorio extends JpaRepository<Testamento, Integer> {
    
} 
