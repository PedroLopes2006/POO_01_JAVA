/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedroa110526;

/**
 *
 * @author alunodev13
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        try{
            float resultado = calc.divisao(10, 0);
            System.out.println("10/0 = " + resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Operação de Divisão finalizada");
        }
        
        
        System.out.println("Soma: " + calc.somar(10,5));
        
        System.out.println("Resultado(s) concluido(s) com sucesso!!");
    }
}
