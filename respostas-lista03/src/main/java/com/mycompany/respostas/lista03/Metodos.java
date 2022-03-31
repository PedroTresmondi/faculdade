/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista03;

/**
 *
 * @author pedro
 */
public class Metodos {

    //questao01
    Double calcularMedia(Double nota1, Double nota2) {
        Double media = (nota1 * 0.4) + (nota2 * 0.6);
        return media;

    }

    //questao02
    Double calcularRendaMensal(Double numeroDigitado) {

        Double qteSalarioMinimo = (numeroDigitado / 1100);
        return qteSalarioMinimo;
    }

    String CalcularClasse(Double qteSalarioMinimo) {

        if (qteSalarioMinimo <= 2) {
            return "E";
        } else if (qteSalarioMinimo >= 2 && qteSalarioMinimo <= 4) {
            return "D";
        } else if (qteSalarioMinimo <= 4 && qteSalarioMinimo <= 10) {
            return "C";
        } else if (qteSalarioMinimo >= 10 && qteSalarioMinimo <= 20) {
            return "B";
        } else {
            return "A";
        }

    }

}
