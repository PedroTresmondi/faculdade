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
public class ClassesSociais {
    public static void main(String[] args) {
        Metodos met = new Metodos();
        
        Scanner numeroDigitado = new Scanner(System.in);
        System.out.println("Insira a sua renda mensal");
        
        Double rendaMensal = numeroDigitado.nextDouble();
        Double qteSalarioMinimo = met.calcularRendaMensal(rendaMensal);
        
        System.out.println(String.format("voce recebe aprox %.1f salários minimo"
                , qteSalarioMinimo));
        
        String classe = met.CalcularClasse(qteSalarioMinimo);
        
        System.out.println(String.format("Você pertence a classe %s", classe));
    }
}
