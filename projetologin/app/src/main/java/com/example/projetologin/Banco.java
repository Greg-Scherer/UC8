/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetologin;

import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author GREGORISCHERERDOSSAN
 */
public class Banco {
   // Lista que simula o banco de dados
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();

    // Método para adicionar um usuário
    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para retornar todos os usuários
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    // Método para buscar usuário pelo email e senha
    public static Usuario autenticar(String email, char[] senha) {
        for (Usuario user : usuarios) {
            if (user.getEmail().equals(email) && Arrays.equals(user.getSenha(), senha)) {
                return user; // usuário encontrado
            }
        }
        return null; // usuario nao encontrado
    }

    // Método para atualizar dados de um usuário
    public static boolean atualizarUsuario(String emailAntigo, String novoNome, String novoEmail, char[] novaSenha) {
        for (Usuario user : usuarios) {
            if (user.getEmail().equals(emailAntigo)) {
                user.setNome(novoNome);
                user.setEmail(novoEmail);
                user.setSenha(novaSenha);
                return true; // atualização bem sucedida
            }
        }
        return false; // usuario nao encontrado
    }

    // Método para remover um usuário
    public static boolean deletarUsuario(String email) {
        for (Usuario user : usuarios) {
            if (user.getEmail().equals(email)) {
                usuarios.remove(user);
                return true; // exclusao bem sucedida
            }
        }
        return false; // usuario nao encontrado
    }
}
     

    
