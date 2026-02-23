/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa230226;

/**
 *
 * @author Pedro
 */
public class Conta {
    private double saldo;
    private int agencia, numero, limite;
    
    double getSaldo(){
        return saldo;
    }
    
    void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    int getAgencia(){
        return agencia;
    }
    
    void setNumero(int numero){
        this.numero = numero;
    }
    
    int getNumero(){
        return numero;
    }
    
    void setLimite(int limite){
        this.limite = limite;
    }
    
    int getLimite(){
        return limite;
    }

    public Conta(){
        
    }
    
    public Conta(int agencia, int numero, double valor, int limite){
        this.agencia = agencia;
        this.numero = numero;
        this.limite = limite;
        saldo = saldo + limite;
        saldo = saldo + valor;
    }
    
    
    
    
    
    void creditar (double valor)
    {
        saldo = saldo + valor;
    }
    
    void debitar (double valor)
    {
        if(valor <= saldo){
            saldo = saldo - valor;
        }
        else{
            System.out.println("ERRO");
        }
    }
    
    void tranferir(Conta destino, double valor)
    {
        if(valor <= saldo){
            debitar(valor);
            destino.creditar(valor);
        }
        else{
            System.out.println("ERRO");
        }
    }
    
    String Imprimir(){
        return ("O saldo em conta é: " + saldo);
    }
    
    
}