import Entidades.Alunos;
import Entidades.Professores;
import Repositorios.RepositorioAlunos;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    RepositorioAlunos repositorioAlunos = new RepositorioAlunos();
    Professores professor = new Professores("Prof. Silva", "Po",2024/11/10);

    while (true) {
        System.out.println("Digite a matrícula do aluno para adicionar nota: ");
        int matricula = 0;
        try {
            matricula = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Matrícula inválida. Por favor, digite um número inteiro.");
            continue;
        }

        Alunos aluno = repositorioAlunos.encontrarAlunoPorMatricula(matricula);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            continue;
        }

        System.out.println("Digite a nota do aluno: ");
        double nota;
        try {
            nota = Double.parseDouble(scanner.next());
            professor.adicionarNota(aluno, (int) nota);
            System.out.println("Nota adicionada com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Nota inválida. Por favor, digite um número válido.");
            continue;
        }

        System.out.print("Deseja adicionar outra nota? (s/n): ");
        String resposta = scanner.next();
        if (!resposta.equalsIgnoreCase("s")) {
            break;
        }
    }

    System.out.println("Sistema de notas encerrado.");
}
