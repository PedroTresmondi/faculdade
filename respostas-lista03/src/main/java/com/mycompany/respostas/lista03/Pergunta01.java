/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista03;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Pergunta01 {

    public static void main(String[] args) {
        Metodos met = new Metodos();
        Scanner numeroDigitado = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        Double nota1 = numeroDigitado.nextDouble();
        System.out.println("Digite a segunda nota");
        Double nota2 = numeroDigitado.nextDouble();

        Double media = met.calcularMedia(nota1, nota2);

        System.out.println(String.format("Sua média foi: %.2f", media));

    }
    
}
