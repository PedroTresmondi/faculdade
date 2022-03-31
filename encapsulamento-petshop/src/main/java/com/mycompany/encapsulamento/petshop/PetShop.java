/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento.petshop;

/**
 *
 * @author pedro
 */
public class PetShop {

    private String nome;
    private Double faturamento;

    public PetShop(String nome, Double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;

    }

    public void darBanho(Pet pet, Double valorGasto) {
        pet.setValorGasto(valorGasto);
        this.faturamento += valorGasto;
        pet.setQtdVisitas(1);

    }

    public void darBanho(Pet pet, Double valorGasto, Integer desconto) {
        Integer qtdVisitas = pet.getQtdVisitas();
        pet.getValorGasto();
        Double valorDesconto = valorGasto - desconto;

        if (qtdVisitas < 2) {
            pet.setValorGasto(valorGasto);
            this.faturamento += valorGasto;
            System.out.println("Não conseguiu desconto ainda");
            pet.setQtdVisitas(1);
        } else {
            this.faturamento += valorDesconto;
            pet.setValorGasto(valorDesconto);
            System.out.println(String.format(" %s Conseguiu desconto de %d",
                    nome,desconto));
            pet.setQtdVisitas(1);

        }

    }

    @Override
    public String toString() {
        return (String.format("[Petshop]"
                + "\nNome: %s"
                + "\n Faturamento: %.2f", nome,faturamento));
    }

}
