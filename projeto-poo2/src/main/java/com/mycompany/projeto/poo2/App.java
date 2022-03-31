/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo2;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        BilheteUnico usuario1 = new BilheteUnico();
        usuario1.titular = "Pedro Tresmondi";
        
        System.out.println(String.format("Bem vindo %s \n"
                + "quanto deseja carregar no cartão?", usuario1.titular));
        Double valorInserido = leitor.nextDouble();
        Boolean sucessoCarregar = usuario1.carregar(valorInserido);
        while (!sucessoCarregar) {
            System.out.println("Digite novamente");
            valorInserido = leitor.nextDouble();
            sucessoCarregar = usuario1.carregar(valorInserido);
           
        
        }
         
        System.out.println(String.format("Cartão carregado com R$%.2f", usuario1.saldo));
        
        Boolean sucesso = usuario1.usarbilhete();
        if (sucesso) {
            System.out.println("Boa viagem!");
            
        } else {
            System.out.println("saldo insuficiente");
        }
       
    }
    
    
}
