package com.biblia.biblia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "verses")
public class Versos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "version")
    private String versao;

    @Column(name = "testament")
    private String testamento;

    @Column(name = "book")
    private String livro;

    @Column(name = "chapter")
    private String capitulo;

    @Column(name = "verse")
    private String versiculo;

    @Column(name = "text")
    private String texto;

    public Versos() {}

    public Versos(int id, String versao, String testamento, String livro, String capitulo, String versiculo, String texto) {
        this.id = id;
        this.versao = versao;
        this.testamento = testamento;
        this.livro = livro;
        this.capitulo = capitulo;
        this.versiculo = versiculo;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getTestamento() {
        return testamento;
    }

    public void setTestamento(String testamento) {
        this.testamento = testamento;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getVersiculo() {
        return versiculo;
    }

    public void setVersiculo(String versiculo) {
        this.versiculo = versiculo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}