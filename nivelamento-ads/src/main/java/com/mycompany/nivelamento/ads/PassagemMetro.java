/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class PassagemMetro {
    public static void main(String[] args) {
        
        Scanner usuarioNome = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nomeDigitado = usuarioNome.nextLine();

        Double saldo = 250.5;
        
        Double viagens = saldo / 4.40;
        
        
       String frase = String.format("Olá %s, você ainda pode usar o metro %d vezes :3",
                nomeDigitado, viagens.intValue());
        
        System.out.println(frase);
        
       
        
    }
    
}
