/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedroa190226;

/**
 *
 * @author Pedro
 */
public class Principal {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(500);
        c1.creditar(1100);
        c1.debitar(600);
        
        Conta c2 = new Conta();
        c1.tranferir(c2, 1000);
        
        System.out.println(c1.Imprimir());
        System.out.println(c2.Imprimir());
    }
}
