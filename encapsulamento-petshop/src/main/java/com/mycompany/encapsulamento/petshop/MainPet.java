/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento.petshop;

/**
 *
 * @author pedro
 */
public class MainPet {

    public static void main(String[] args) {
        Pet macaco = new Pet("Pierre", "Prego", 0, 0.00);
        Pet cachorro = new Pet("Pinga", "Buldogue", 0, 0.00);
        Pet pinguim = new Pet("Pingu", "Pinguim-rei", 0, 0.00);

        PetShop petshop1 = new PetShop("Lava-Rápido", 0.00);
        PetShop petshop2 = new PetShop("McDonald's", 0.00);
        

        petshop2.darBanho(pinguim, 100.00);
        petshop2.darBanho(pinguim, 250.00);
        petshop2.darBanho(pinguim, 300.00);
        petshop2.darBanho(pinguim, 300.00);
        petshop2.darBanho(pinguim, 300.00, 150);
        petshop1.darBanho(cachorro, 100.00);
        petshop1.darBanho(macaco, 100.00);
        petshop1.darBanho(macaco, 150.00);
        petshop1.darBanho(macaco, 200.00, 50);

        System.out.println(petshop1);
        System.out.println(cachorro);
        System.out.println(macaco);

    }
}
