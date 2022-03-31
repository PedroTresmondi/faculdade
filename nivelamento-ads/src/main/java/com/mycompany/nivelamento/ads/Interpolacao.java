/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

/**
 *
 * @author pedro
 */
public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Maria";
        Integer idade = 30;
        Double altura = 1.65;
        Integer quantidadePets = 3;
        
        /*
                System.out.println("Meu nome é " + nome+
                " tenho " + idade+ " de idade "+ 
                        "e " + altura + " de altura." );
        
       */
        
        //aPRESNETAÇÃO
        

        //Interpolação
        
        String frase = String.format("Meu nome é %s, tenho %d anos, e %.2f de altura e tenho %d gatos",
                        nome, idade, altura, quantidadePets);
        
        System.out.println(frase);
    }
    
}
