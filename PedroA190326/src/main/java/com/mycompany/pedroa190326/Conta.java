/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa190326;

/**
 *
 * @author Alunolab13
 */
public class Conta {
    private String numeroConta;
    private double saldo;
    private Titular titular;
    private Notificador notificador =  new Notificador();

    public Conta() {
    }

    public Conta(String numeroConta, Titular titular, Notificador notificador) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.notificador = notificador;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    
    public boolean sacar(double valor){
        if(valor <= saldo){
            System.out.println("Transação Aprovada");
            return true;
        }
        else
        {
            System.out.println("Transação Negada, saldo insuficiênte");
            return false;
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void exibir(){
        System.out.println(numeroConta);
        System.out.println(saldo);
        System.out.println(titular);
        System.out.println(notificador);
    }
    
    public void consultarSaldo(){
        notificador.enviarSaldo(titular, this);
    }
    
    
    
    
    
    
}
