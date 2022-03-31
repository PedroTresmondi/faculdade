/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedro.tresmondi.ac1;

/**
 *
 * @author pedro
 */
public class VendaLivro {

    public static void main(String[] args) {
        Metodos util = new Metodos();
        Integer escolhaMenu = 1;
        
        

        util.bemVindo();
        Integer estoqueInicial = util.estoque();
        Integer metaArredondada = util.metaVendas(estoqueInicial);
        Integer qteInserida = util.atualizarEstoque(estoqueInicial, estoqueInicial);
  
        util.menu(estoqueInicial, metaArredondada, estoqueInicial,qteInserida);
        estoqueInicial = util.atualizarEstoque(qteInserida, qteInserida);
       
        
         util.sair();
      
        
        
        
       
        
        
      
           

    }
}
