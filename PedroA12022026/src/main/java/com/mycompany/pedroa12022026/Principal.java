/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedroa12022026;

/**
 *
 * @author Pedro
 */
public class Principal {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.creditar(400);
        c1.debitar(200);
        
        System.out.println(c1.Imprimir());
    }
}
