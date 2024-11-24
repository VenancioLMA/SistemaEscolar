package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    String materia;
    int numero;
    int andar;
    LocalDate data;
    List<Alunos> alunos = new ArrayList<>();

    public Turma(String materia, int numero, int andar, LocalDate data, Alunos aluno) {
        this.materia = materia;
        this.numero = numero;
        this.andar = andar;
        this.data = data;
        this.alunos.add(aluno);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Alunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Alunos> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Alunos aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Alunos aluno) {
        this.alunos.remove(aluno);
    }

    public void alterarAluno(Alunos aluno) {
        this.alunos.set(alunos.indexOf(aluno), aluno);
    }

    public Alunos buscarAluno(String matricula) {
        for (Alunos aluno : alunos) {
        }
        return null;
    }
    public void imprimirAlunos() {
        for (Alunos aluno : alunos) {
            System.out.println(aluno);
        }
    }
    public void adicionarprofessor() {
        this.adicionarprofessor();
    }
}