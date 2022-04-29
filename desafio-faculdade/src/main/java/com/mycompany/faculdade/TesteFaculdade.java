/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculdade;

/**
 *
 * @author pedro.h.tresmondi
 */
public class TesteFaculdade {

    public static void main(String[] args) {
        Aluno al1 = new Aluno("1111", "Pedro Tresmondi", 1, true);
        Aluno al2 = new Aluno("2222", "Victor Afonso", 2, true);
        Aluno al3 = new Aluno("3333", "Julia Mercia", 1, true);
        Aluno al4 = new Aluno("4444", "Inocencio Coitadinho", 1, true);
        Aluno al5 = new Aluno("5555", "Patati", 2, true);
        Aluno al6 = new Aluno("6666", "Patata", 2, true);
        Aluno al7 = new Aluno("7777", "Janeiro Fevereiro de Março Abril", 3, true);

        Faculdade fac1 = new Faculdade("Sptech");

        fac1.matricularAluno(al1);
        fac1.matricularAluno(al2);
        fac1.matricularAluno(al3);
        fac1.matricularAluno(al4);
        fac1.matricularAluno(al5);
        fac1.matricularAluno(al6);
        fac1.matricularAluno(al7);

        fac1.cancelarMatricula("5555");
        fac1.cancelarMatricula("6666");

        fac1.exibirAlunosPorSemestre(1);
        fac1.exibirAlunosPorSemestre(2);
        fac1.exibirAlunosPorSemestre(3);

        System.out.println("=====Exibindo alunos atuais :D=====");
        fac1.exibirAlunos();

        System.out.println("=====Exibindo alunos desativados D:=====");
        fac1.exibirCancelados();

    }
}
