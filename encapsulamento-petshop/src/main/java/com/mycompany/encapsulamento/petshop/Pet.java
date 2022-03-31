/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento.petshop;

/**
 *
 * @author pedro
 */
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitas = 0;
    private Double valorGasto = 0.00;

    public Pet(String nome, String raca, Integer qtdVisitas, Double valorGasto) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = qtdVisitas;
        this.valorGasto = valorGasto;
    }


     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the qtdVisitas
     */
    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    /**
     * @param qtdVisitas the qtdVisitas to set
     */
    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas += qtdVisitas;
    }

    /**
     * @return the valorGasto
     */
    public Double getValorGasto() {
        return valorGasto;
    }

    /**
     * @param valorGasto the valorGasto to set
     */
    public void setValorGasto(Double valorGasto) {
        this.valorGasto += valorGasto;
    }
    
    
    
    @Override
    public String toString() {
        return (String.format("Pet :"
                + "\n nome: %s"
                + "\n Raça: %s"
                + "\n qtdVisitas: %d"
                + "\n Valor Gasto: %.2f"
                ,nome, raca,qtdVisitas, getValorGasto()));
                
                
                
              
    }

   
}
