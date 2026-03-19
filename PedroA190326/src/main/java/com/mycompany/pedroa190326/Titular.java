/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa190326;

/**
 *
 * @author Alunolab13
 */
public class Titular {
    private String nome;
    private String cpf;
    private String email;

    public Titular() {
    }
    
    public Titular(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void exibir(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(email);
    }
    
    
    
    
    
    
    
}
