/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista02;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pedro
 */
public class Acumulador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
       
        
        
        Integer numeroSoma = 0;
        Integer contador = 0;
        Integer numeroDigitado;
        do {
             System.out.println("Digite um numero");
            numeroDigitado = leitor.nextInt();
            numeroSoma += numeroDigitado;
            contador++;

        } while (numeroDigitado != 0);
        System.out.println(String.format("A soma dos numeros sorteados foi: %d "
                + "numeros lidos : %d ",
                 numeroSoma, contador));
    }
}
