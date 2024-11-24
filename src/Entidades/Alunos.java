package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Alunos {
    String nome;
    int matricula;
    int idade;
    LocalDate data;
    private int alunoQ;
    private List<Double> notas = new ArrayList<>();
    public Alunos(){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.data = LocalDate.now();
        this.alunoQ = alunoQ;
        this.idade = idade;
        
    }

    public Alunos(String nome, int matricula) {
    }

    public String getNome(){

        return nome;
   }
   public int getMatricula(){
        return matricula;

   }
   public int getIdade(){

        return idade;
   }
   public LocalDate getData(){

        return data;
   }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setAlunoQ(int alunoQ) {
        this.alunoQ = alunoQ;
    }
    public int getAlunoQ(){
        return alunoQ;
    }
    public boolean adicionaAluno(Alunos aluno){
        if (this.alunoQ < aluno.getAlunoQ()){
            aluno.setAlunoQ(aluno.getAlunoQ() + 1);
        }
        return false;
    }
    public void adicionaNota(double nota){
        this.notas.add(nota);
    }
    public double calculaMedia(){
        if(notas.isEmpty()){
            return 0;
        }
        double soma = 0;
        for(double nota: notas){
            soma += nota;
        }
        return soma;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", idade=" + idade +
                ", data=" + data +
                '}';
    }

    public void adicionarNota(int nota) {
    }
}






