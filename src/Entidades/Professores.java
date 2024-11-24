package Entidades;

import java.time.LocalDate;

public class Professores {
    String nome;
    String materia;
    int matricula;
    LocalDate data;
    int nota;

    public Professores(String nome, String materia, int matricula){
        this.nome = nome;
        this.materia = materia;
        this.matricula = matricula;
        this.data = LocalDate.now();


    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getMateria() {

        return materia;
    }

    public void setMateria(String materia) {

        this.materia = materia;
    }

    public int getMatricula() {

        return matricula;
    }

    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }

    public LocalDate getData() {

        return data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }
    public void adicionarNota(Alunos aluno,int matricula){
        aluno.adicionarNota(nota);
    }


    @Override
    public String toString() {
        return "Professores" +
                "Nome: " + nome  +
                ", Materia: " + materia +
                ", Matricula: " + matricula +
                ", Data: " + data +
                '.';
    }
}

