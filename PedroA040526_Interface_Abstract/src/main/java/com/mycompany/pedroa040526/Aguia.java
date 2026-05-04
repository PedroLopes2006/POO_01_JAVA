/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedroa040526;

/**
 *
 * @author alunolab13
 */
public class Aguia extends Animal implements InterfaceVoar{
    private double envergadura;

    public Aguia(String nome, double peso, String habitat, double envergadura) {
        super(nome, peso, habitat);
        this.envergadura = envergadura;
    }

    @Override
    public void emitirSom() {
        System.out.println("🦅 " + getNome() + ": KREEEE KREEEE!");
    }

    @Override
    public void alimentar() {
        System.out.println("🦅" + getNome() + ": Mergulha em voo rasante "
                + "e captura um peixe com as garras!");
    }

    @Override
    public void decolar() {
        System.out.println("🦅" + getNome() + " abre asas (" + envergadura + "m) "
                + "e decola das rochas!");
     
    }

    @Override
    public void voar(String Destino) {
        System.out.println("🦅" + getNome() + "voa em direção a " + Destino + ".");
    }

    @Override
    public void pousar() {
        System.out.println("🦅" + getNome() + "Pousa no destino fechando as asas!");
    }
    
}
