package com.mycompany.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Integer getQuantidade() {
      
        return produtos.size();

    }

    public void adicionar(Produto produto) {
        if (produto == null) {
            

        } else {
            this.produtos.add(produto);
        }

    }

    public boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return true;
            }
        }
        return false;

    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer quantidade = 0;
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(nome)) {
                quantidade++;
               
            }
        }
        return quantidade;
    }

    public void limpar() {
        System.out.println("Removendo tudo do carrinho D:");
        this.produtos.removeAll(produtos);

    }

    public void removePorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {

                produtos.remove(i);

            }

        }

    }

    public Double getValorTotal() {
        Double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();

        }
        

        return total;
    }

    public Produto getPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {

                return produto;

            }

        }
        return null;
    }

}
