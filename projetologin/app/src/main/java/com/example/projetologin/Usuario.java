/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetologin;

/**
 *
 * @author GREGORISCHERERDOSSAN
 */
public class Usuario {
    private String nome;
    private String email;
    private char[] senha;

    public Usuario(String nome, String email, char[] senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    
    
}

