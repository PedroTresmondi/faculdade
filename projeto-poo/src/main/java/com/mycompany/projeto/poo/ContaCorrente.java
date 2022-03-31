/*32
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

public class ContaCorrente {

    //Declarando as caracteristicas da conta
    //Atributos
    String titular;
    Double saldo = 0.0;

    //Declarando os comportamentos ou habilidades da nossa conta
    void depositar(Double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Depositou!");

    }

    void sacar(Double valorSaque) {
       
        
        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente");
            
            
        } else {
            saldo -= valorSaque;
            System.out.println("Sacou!");
            
        }
        
        

    }

}
