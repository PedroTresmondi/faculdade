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
public class Leitura {

    public static void main(String[] args) {

        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeDigitado = leitorTexto.nextLine();

        System.out.println("Olá, " + nomeDigitado);

        System.out.println("Digite a sua idade");

        Integer idadeDigitada = leitorNumero.nextInt();

        System.out.println("Sua idade " + idadeDigitada);

        System.out.println("Dados: " + idadeDigitada + ", " + nomeDigitado);

        System.out.println("Digite sua altura");
        Double altura = leitorNumero.nextDouble();

        System.out.println("A altura digitada foi: " + altura);

    }

}
