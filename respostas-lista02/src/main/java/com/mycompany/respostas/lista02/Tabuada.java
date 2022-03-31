/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista02;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com um numero de 1 a 10");
        Integer numeroDigitado = leitor.nextInt();
        Integer multiplicador = 0;
        Integer resultado = 0;

        do {
            if (numeroDigitado >= 10 || numeroDigitado <= 0) {
                System.out.println("Entre um numero entre 1 A 10!!!");
                numeroDigitado = leitor.nextInt();

            }
            else{ multiplicador++;
                resultado = (numeroDigitado * multiplicador);
                System.out.println(String.format("%d X %d = %d", numeroDigitado,
                        multiplicador, resultado));}
           
        } while (multiplicador <= 9);

    }
}
