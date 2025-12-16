/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Aula2410;

/**
 *
 * @author GREGORISCHERERDOSSAN
 */
public class pokemonn {
    private final String nome;
    private final String tipo;
    private final int nivel;

    public pokemonn(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public int getNivel() { return nivel; }
}
