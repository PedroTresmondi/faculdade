/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.encapsulamento;

import javax.xml.namespace.QName;

public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private Double nota;
    private Double nota2;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setNota(Double nota) {
        if (nota >= 0 && nota <= 10) {

            this.nota = nota;
        }

    }
    

    public void setNota2(Double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {

            this.nota2 = nota2;
        }

    }

    public Double getNota() {
        return nota;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getMedia() {
        Double media = (this.nota + this.nota2) / 2;
        return media;
    }
/*
    @Override
    public String toString() {
        return "- RA:" + ra + " \n- Nome:" + nome + " \n- Curso:"
                + curso + " \n- Nota:" + nota + " \n- Nota2:" + nota2 
                + "\n- Média:" + this.getMedia();
    }*/
    @Override
    public String toString(){
        return (String.format(
                "Nome: %s \n"
                + "RA: %s \n"
                + "Curso: %S \n"
                + "Nota1: %.2f \n"
                + "Nota2: %.2f \n"
                + "Média: %.1f ", nome, ra, curso, nota, nota2, getMedia()));
    }

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
      
    }

   

    
}
