/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo2;

/**
 *
 * @author pedro
 */
public class BilheteUnico {

    String titular;
    Double saldo = 0.0;

    Boolean carregar(Double valorCarregado) {
        if (valorCarregado < 4.40) {
            System.out.println("Carrege um valor maior que 4.40!");
            return false;

        } else {
            saldo += valorCarregado;
            System.out.println("Cartão Carregado :)");
            return true;

        }

    }

    Boolean usarbilhete() {
        if (saldo < 4.40) {
            return false;

        } else {
            saldo -= 4.40;
            System.out.println("seu saldo atual: R$" + saldo);

            return true;

        }

    }

}
