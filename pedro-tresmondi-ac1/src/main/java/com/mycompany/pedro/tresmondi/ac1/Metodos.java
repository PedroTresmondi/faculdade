/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedro.tresmondi.ac1;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Metodos {

    Scanner leitor = new Scanner(System.in);

    void bemVindo() {
        System.out.println("Bem vindoescritor! Realize o controle do lançamento"
                + "de seu livro:");
    }

    Integer estoque() {
        System.out.println("quantidade disponível:");
        Integer estoqueInicial = leitor.nextInt();
        return estoqueInicial;
    }

    Integer metaVendas(Integer estoqueInicial) {
        System.out.println("Meta de vendas dos livros em porcentagem (%)");
        Double metaVendas = leitor.nextDouble();
        Double metaPor = metaVendas / 100;
        Double metaCalc = estoqueInicial * metaPor;
        System.out.println(String.format("Para bater a meta, você precisa vender"
                + " %.0f livros",
                metaCalc));
        Integer metaArredondada = metaCalc.intValue();
        return metaArredondada;
    }

    void qteInserida(Integer estoqueInicial, Integer metaArredondada, Integer estoqueAtualizado) {

        System.out.println("Digite a quantidade de livros escolhida:");
        atualizarEstoque(estoqueInicial, estoqueInicial);
        Integer qteProdutos = leitor.nextInt();
        System.out.println(String.format("Quantidade disponivel: %d", estoqueInicial));

        while (qteProdutos > estoqueInicial) {

            if (qteProdutos < 0) {
                System.out.println("Digite uma quantidade válida");

            } else {
                System.out.println("Infelizmente você não possui exemplares suficientes"
                        + " para a venda");
                System.out.println("Digite a quantidade de livros escolhida:");
                qteProdutos = leitor.nextInt();
            }
        }
        Integer contadorVenda;
        for (contadorVenda = 0; contadorVenda < qteProdutos;) {
            contadorVenda++;
            estoqueInicial--;
            
            System.out.println(String.format("Vendendo do %dº livo!",
                    contadorVenda));

        }
        System.out.println(String.format("você acabou de vender %d livros!"
                + "\n Quantidade em estoque: %d"
                + "\n Meta de vendas: %d", contadorVenda, estoqueAtualizado, metaArredondada));
    }

    Integer atualizarEstoque(Integer qteInserida, Integer qteEstoque) {
            Integer estoqueAtualizado = qteEstoque - qteInserida;
            return estoqueAtualizado;
    }

    void menu(Integer qteEstoque, Integer metaArredondada, Integer escolhaMenu, Integer qteInserida) {
        while (escolhaMenu != 2) {
            System.out.println("Escolha os proximos passos"
                    + "\n (1)- Vender Livros"
                    + "\n (2)- Sair");
            escolhaMenu = leitor.nextInt();
            switch (escolhaMenu) {
                case 1:
                    qteInserida(qteEstoque, metaArredondada);
                    atualizarEstoque(qteInserida, qteEstoque);

                case 2:
                    sair();

            }

        }

    }

    boolean sair() {
        System.out.println("Encerrando Programa");
        return false;
    }

}
