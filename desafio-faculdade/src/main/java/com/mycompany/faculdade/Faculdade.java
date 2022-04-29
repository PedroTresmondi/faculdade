package com.mycompany.faculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void matricularAluno(Aluno aluno) {
        if (aluno == null) {
            System.out.println("Aluno não encontrado!");

        } else {
            this.alunos.add(aluno);
        }
    }

    /*
    public void cancelarMatricula(String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                aluno.setAtivo(false);
            }
        }
        //alunos.get(i).setSemestre(0);
        System.out.println("Cancelando matícula");
    }
     */
    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(ra)) {
                alunos.get(i).setAtivo(false);

            }
        }
        //alunos.get(i).setSemestre(0);
        System.out.println("Cancelando matícula");
    }

    /*
    public void exibirCancelados() {
        for (Aluno aluno : alunos) {
            if (aluno.getAtivo().equals(false)) {
                System.out.println(aluno.getNome());
            }
        }
    }
     */
    public void exibirCancelados() {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getAtivo().equals(false)) {
                System.out.println(alunos.get(i).getNome());

            }

        }
    }

    /*
    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno.getAtivo().equals(true)) {
                System.out.println(aluno.getNome());

            }

        }

    }
     */
    public void exibirAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getAtivo().equals(true)) {
                System.out.println(alunos.get(i).getNome());

            }

        }
    }

    /*
    public void exibirAlunosPorSemestre(Integer semestre) {
        Integer alunosSemestre = 0;
        for (Aluno aluno : alunos) {
            if (aluno.getSemestre().equals(semestre)) {
                alunosSemestre++;
            }

        }
        System.out.println(String.format("Exibindo quantidade de alunos no %d° "
                + "semestre: %d",
                semestre, alunosSemestre));
    }
     */
    public void exibirAlunosPorSemestre(Integer semestre) {
        Integer alunosPorSemtestre = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getSemestre().equals(semestre)) {
                alunosPorSemtestre++;

            }

        }
        System.out.println(String.format("Exibindo quantidade de alunos no %d° "
                + "semestre: %d",
                semestre, alunosPorSemtestre));
    }

}
