/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa110526;

/**
 *
 * @author alunodev13
 */
public class Calculadora {
     

    
    public float somar(float numero1, float numero2){
        return numero1 + numero2;
    }
    
    public float divisao(float numero1, float numero2)throws DivisaoPorZeroException{
            
            if(numero2 ==0){
                throw new DivisaoPorZeroException();
            }
            
            return numero1/numero2;
        
        }
}

