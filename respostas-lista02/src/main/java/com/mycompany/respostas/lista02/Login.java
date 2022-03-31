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
public class Login {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Boolean autenticado = false;

        do {

            System.out.println("Informe o seu login");
            String loginDigitado = leitor.nextLine();
            System.out.println("Informe a sua senha");
            String senhaDigitado = leitor.nextLine();

            if ((loginDigitado.equals("admin")
                    && senhaDigitado.equals("#Bandtec"))) {

                System.out.println(String.format("Usuario %s logado com sucesso!"
                        , loginDigitado));
                break;

            } else {
                System.out.println("ERRO login/senha invalido!");
            }

        } while (autenticado == false);
    }
};
