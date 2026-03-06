/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedroa050326;
//import java.util.*; IMPORTANDO PARA SCANNER
import javax.swing.JOptionPane; //IMPORTANDO PARA INTERFACE
/**
 *
 * @author Pedro
 */
public class Principal {

    public static void main(String[] args) {
        int i, opcao, esc_conta;
        Conta[] c = new Conta[2]; 
        

//        Scanner sc = new Scanner(System.in); JAVA.UTIL
//        System.out.println("Digite a agência da conta 1:");
//        int agencia = sc.nextInt();
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: 0 - Encerrar\n 1 - Criar Contas\n 2 - Tranferir\n 3 - Mostrar saldo das contas"));
            if(opcao == 0){
                JOptionPane.showMessageDialog(null, "O programa foi encerrado com sucesso");
                break;
            }
            else if(opcao == 1){
                for (i = 0; i <= 1; i++){
                    int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agência da conta" + (i+1) + ":"));
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta" + (i+1) + ":"));
                    double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta" + (i+1) + ":"));
                    double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta" + (i+1) + ":"));
                    
                    c[i] = new Conta(agencia, numero, saldoInicial, limite);  
                }
            }
            else if(opcao == 2){
                esc_conta = Integer.parseInt(JOptionPane.showInputDialog("Para qual conta deseja fazer a transferencia: "));
                double tranferir = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto deseja tranferir para a conta:"));
                switch (esc_conta){
                    case 1 ->{
                        c[1].tranferir(c[0], tranferir);
                     }
                    case 2 ->{
                        c[0].tranferir(c[1], tranferir);
                    }
                }
                        
     
            }
            else{
                JOptionPane.showMessageDialog(null, "O saldo da conta 1 é:" + c[0].getSaldoDisponivel());
                JOptionPane.showMessageDialog(null, "O saldo da conta 2 é:" + c[1].getSaldoDisponivel());
            }
            
        }while(true);
//        String conta = nome;
//          int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agência da conta 1:"));
//        
////        System.out.println("Digite o numero da conta 1:");
////        int numero = sc.nextInt();
//          int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta 1:"));
//        
////        System.out.println("Digite o saldo inicial da conta 1:");
////        double saldoInicial = sc.nextDouble();
//          double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta 1:"));
//        
////        System.out.println("Digite o limite da conta 1:");
////        double limite = sc.nextDouble();
//          double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta 1:"));
//          
//          double tranferir = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto deseja tranferir para a conta 2:"));
//        
//          double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta 1:"));
//          
//          
//        Conta c1 = new Conta(agencia, numero, saldoInicial, limite);
////        Conta c2 = new Conta(345, 888, 1000, 800);
//        Conta c2 = new Conta(agencia, numero, saldoInicial, limite);
//        
//        c1.tranferir(c2, tranferir);
//        
//        JOptionPane.showMessageDialog(null, "O saldo da conta 1 é:" + c1.getSaldoDisponivel());
//        JOptionPane.showMessageDialog(null, "O saldo da conta 2 é:" + c2.getSaldoDisponivel());
//        
////        System.out.println(c1.getSaldoDisponivel());
////        System.out.println(c2.getSaldoDisponivel());
        
    }
}