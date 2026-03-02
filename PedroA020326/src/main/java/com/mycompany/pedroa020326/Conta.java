/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa020326;

/**
 *
 * @author alunolab13
 */
public class Conta {
    private double saldo, SaldoInicial, limite;
    private int agencia, numero;
    
    double getSaldo(){
        return saldo;
    }
    
    void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    public double getSaldoDisponivel(){
        return saldo + limite;
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
    
    double getLimite(){
        return limite;
    }

    public Conta(){
        
    }
    
    public Conta(int agencia, int numero, double SaldoInicial, double limite){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = SaldoInicial;
        this.limite = limite;
    }
    
    
    
    
    
    void creditar (double valor)
    {
        saldo = saldo + valor;
    }
    
    public boolean debitar (double valor)
    {
        if(valor <= getSaldoDisponivel()){
            saldo = saldo - valor;
            return true;
        }
        else{
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }
    
    public boolean tranferir(Conta destino, double valor)
    {
        if(this.debitar(valor)){
            destino.creditar(valor);
            return true;
        }
        else{
            System.out.println("Tranferência não realizada.");
            return false;
        }
    }
    
    String Imprimir(){
        return ("O saldo em conta é: " + saldo);
    }
    
    
}