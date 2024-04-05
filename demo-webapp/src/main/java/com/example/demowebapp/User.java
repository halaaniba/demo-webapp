package com.example.demowebapp;

import java.time.OffsetDateTime;

public class User {
    private String nome;
    private String provincia;
    private String saluto;
    private OffsetDateTime dataDiNascita;

    public User(String nome, String provincia, String saluto, OffsetDateTime dataDiNascita) {
        this.nome = nome;
        this.saluto = saluto;
        this.provincia = provincia;
        this.dataDiNascita = dataDiNascita;
    }

    public User() {

    }

    ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", provincia='" + provincia + '\'' +
                ", saluto='" + saluto + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}

