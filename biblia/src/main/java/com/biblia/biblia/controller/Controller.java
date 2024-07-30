package com.biblia.biblia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblia.biblia.model.Livros;
import com.biblia.biblia.model.Testamento;
import com.biblia.biblia.model.Versos;
import com.biblia.biblia.repository.LivrosRepositorio;
import com.biblia.biblia.repository.TestamentoRepositorio;
import com.biblia.biblia.repository.VersosRepositorio;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private LivrosRepositorio lr;

    @Autowired
    private VersosRepositorio vr;

    @Autowired
    private TestamentoRepositorio tr;
    
    @GetMapping("/livros")
    public List<Livros> livros() {
        List<Livros> lista = lr.findAll();
        return lista;
    }

    @GetMapping("/versos")
    public List<Versos> versos() {
        List<Versos> lista = vr.findAll();
        return lista;
    }

    @GetMapping("/testamento")
    public List<Testamento> testamento() {
        List<Testamento> lista = tr.findAll();
        return lista;
    }
    
}
