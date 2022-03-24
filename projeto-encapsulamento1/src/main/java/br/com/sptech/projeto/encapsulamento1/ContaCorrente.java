package br.com.sptech.projeto.encapsulamento1;

/**
 *
 * @author pedro.h.tresmondi
 */
public class ContaCorrente {

    private String nomeTitular;
    private Double saldo;

    public ContaCorrente(String nomeTitular, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public boolean sacar(Double valorSacar) {
        if (valorSacar <= this.saldo) {
            this.saldo -= valorSacar;
            return true;
        } else{
            return false;
           
        }

    }



}
