package com.mycompany.nivelamento.ads;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Condicionais {

    public static void main(String[] args) {
        Integer numero = 42;

        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Digite um numero");

        Integer numeroDigitado = leitorNumero.nextInt();

        if (numero > numeroDigitado) {
            System.out.println(numero + " Maior que " + numeroDigitado);
        } else if (numero < numeroDigitado) {
            System.out.println(numero + " Menor que " + numeroDigitado);
        } else {
            System.out.println("Você digitou 42");
        }
        
    
    }
}
