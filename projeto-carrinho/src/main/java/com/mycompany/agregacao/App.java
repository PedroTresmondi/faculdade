/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agregacao;

/**
 *
 * @author pedro.h.tresmondi
 */
public class App {

    public static void main(String[] args) {
        Carrinho carr1 = new Carrinho("Pedro");

        Produto p1 = new Produto("Banana", "Fruta", 2.00);
        Produto p2 = new Produto("Monster", "Bebida", 8.00);
        Produto p3 = new Produto("Carne", "Alimento", 70.00);
        Produto p4 = new Produto("Batata", "Alimento", 5.00);
        Produto p5 = new Produto("Vodka", "Bebida", 45.00);
        Produto p6 = new Produto("Sanduiche natura", "Alimento", 13.00);
        Produto p7 = new Produto("Patati", "palhaço", 500.00);

        carr1.adicionar(p1);
        carr1.adicionar(p1);
        carr1.adicionar(p2);
        carr1.adicionar(p3);
        carr1.adicionar(p4);
        carr1.adicionar(p5);
        carr1.adicionar(p6);
        carr1.adicionar(p7);

        System.out.println("Quantidade de produtos no carrinho:");
        System.out.println(carr1.getQuantidade());

        System.out.println("Quantidade de produtos encontrada:");
        System.out.println(carr1.getQuantidadePorCategoria("Fruta"));
        System.out.println(carr1.getQuantidadePorCategoria("Bebida"));
        
        System.out.println("O item existe no carrinho?");
        System.out.println(carr1.existsPorNome("Monster"));

        System.out.println("Valor Total do carrinho: ");
        System.out.println(carr1.getValorTotal());

        System.out.println(carr1.getPorNome("Banana"));
        System.out.println(carr1.getPorNome("Patati"));
        carr1.removePorNome("Banana");
        carr1.limpar();

    }

}
