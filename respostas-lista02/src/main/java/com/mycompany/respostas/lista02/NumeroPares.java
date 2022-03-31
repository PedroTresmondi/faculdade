/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista02;

/**
 *
 * @author pedro
 */
public class NumeroPares {

    public static void main(String[] args) {

        int numeroPar = 0;
        while (numeroPar <= 40) {
            numeroPar++;
            if (numeroPar % 2 == 0) {
                System.out.println(numeroPar);
            }
        }

    }
}
