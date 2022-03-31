/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        ContaCorrente conta1 = new ContaCorrente();

        conta1.titular = "Pedro";

        System.out.println(String.format("Bem vindo %s \n seu saldo é %.2f"
                + "\n quanto gostaria de depositar na conta?", conta1.titular,
                conta1.saldo));
        Double deposito = leitor.nextDouble();

        conta1.depositar(deposito);
        System.out.println(conta1.saldo);

        System.out.println(String.format("Bem vindo %s \n seu saldo é %.2f"
                + "\n  gostaria de sacar alguma quantia na sua conta?",
                conta1.titular, conta1.saldo));
        
        Double saque = leitor.nextDouble();
        
        conta1.sacar(saque);
        
        System.out.println(conta1.saldo);

    }
}
