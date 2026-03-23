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
public class ContaPoupanca extends Conta {
    private double taxaJuros;
    private int diaAniversario;
    private int ultimoDiaRendimento = -1;

    public ContaPoupanca() {
    }


    public ContaPoupanca(double taxaJuros, int diaAniversario, String numeroConta, Titular titular, Notificador notificador) {
        super(numeroConta, titular, notificador);
        this.taxaJuros = taxaJuros;
        this.diaAniversario = diaAniversario;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
     public int getDiaAniversario() {
        return diaAniversario;
    }
    
    public void renderJuros(){
        int diaAtual = LocalDate.now().getDayOfMonth();
        if(diaAtual == getDiaAniversario()){
            double juros = getSaldo() * taxaJuros;
            depositar(juros);
            System.out.println("Juros aplicados:" + juros);
        }
    }

    public void sacarPoupanca(double valor){
        sacar(valor);
    }
    
    @Override
    public void exibir(){
        System.out.println(taxaJuros);
        System.out.println(diaAniversario);
    }
    

    
    
}
