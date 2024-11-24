package Repositorios;

import Entidades.Alunos;

public class RepositorioAlunos {
    public Alunos encontrarAlunoPorMatricula(int matricula) {
        Alunos aluno = new Alunos();
        return aluno;
    }
RepositorioAlunos RepositorioAlunos = new RepositorioAlunos();
    public void inserirAluno(Alunos aluno) {
        RepositorioAlunos.inserirAluno(aluno);
    }
}
