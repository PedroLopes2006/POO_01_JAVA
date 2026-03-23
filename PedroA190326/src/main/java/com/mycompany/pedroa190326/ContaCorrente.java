/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa190326;
import java.time.LocalDate; 

/**
 *
 * @author Alunolab13
 */
public class ContaCorrente extends Conta{
    private double limite;
    private int diaVencimento;
    private double tarifa;

    public ContaCorrente() {
    }

    public ContaCorrente(double limite, int diaVencimento, String numeroConta, Titular titular, Notificador notificador) {
        super(numeroConta, titular, notificador);
        this.limite = limite;
        this.diaVencimento = diaVencimento;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public boolean sacarComLimite(double valor){
        double saldoDisponivel = getSaldo() + limite;
        if(valor <= saldoDisponivel){
            sacar(valor);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void cobrarTarifa(int diaVencimento){
        int diaAtual = LocalDate.now().getDayOfMonth();
        if(diaAtual == this.diaVencimento){
            sacar(tarifa);
        }
    }
    
    @Override
    public void exibir(){
        System.out.println(limite);
        System.out.println(diaVencimento);
    }
}
