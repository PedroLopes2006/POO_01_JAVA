/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa12022026;

/**
 *
 * @author Pedro
 */
public class Conta {
    private double saldo;
    
    public void creditar (double valor)
    {
        saldo = saldo + valor;
    }
    
    public void debitar (double valor)
    {
        saldo = saldo - valor;
    }
    
    String Imprimir(){
        return ("O saldo em conta é: " + saldo);
    }
    
    
}
