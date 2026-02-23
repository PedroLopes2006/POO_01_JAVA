/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedroa230226;

/**
 *
 * @author Pedro
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(123, 6630, 5000);
        Conta c2 = new Conta();
        c2.setAgencia(124);
        c2.setNumero(6631);
        c2.creditar(15000);
        
        c1.tranferir(c2, 4000);
        
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
