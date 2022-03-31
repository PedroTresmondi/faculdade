/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista02;

/**
 *
 * @author pedro
 */
public class ContadorVariado {

    public static void main(String[] args) {

        
        
        for (double valor = 0; valor < 5; valor++) {
            double valorVariado = 0.15 * valor;
            System.out.println(String.format("%f.2", valorVariado));
        }
    }

}
