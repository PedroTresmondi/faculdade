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
public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 10");

        Integer numeroDigitado;
        Integer numeroAleatorio;
        Integer contador = 0;
        do {
            numeroDigitado = leitor.nextInt();
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            if (numeroDigitado <= 0 && numeroDigitado <= 10) {
            } else {
                while (numeroDigitado < 0 || numeroDigitado > 10) {
                    System.out.println("ENTRE COM UM NUMERO DE 0 A 10");
                    numeroDigitado = leitor.nextInt();
                }
            }
            System.out.println("ERROU BURRO");
            contador++;
            System.out.println(contador);

        } while (numeroDigitado != numeroAleatorio);

        if (contador <= 3) {
            System.out.println("Você é MUITO sortudo!!");

        } else if (contador <= 10) {
            System.out.println("Você é sortudo!");

        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
