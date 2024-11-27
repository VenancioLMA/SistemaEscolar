package Servicos;

import Entidades.Alunos;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        int cont = 2; // Limite de alunos
        Scanner scanner = new Scanner(System.in);
        int numeroDeAlunos = 0;

        while (numeroDeAlunos < cont) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();

            System.out.println("Digite a data de nascimento do aluno (dd/mm/yyyy): ");
            String dataNascimento = scanner.next();

            System.out.println("Digite a matrícula do aluno: ");
            int matricula = 0;

            try {
                matricula = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Matrícula inválida. Por favor, digite um número inteiro.");
                continue;
            }

            Alunos aluno;
            aluno = new Alunos();
            numeroDeAlunos++;
            System.out.println("Aluno cadastrado com sucesso!");

            if (numeroDeAlunos < cont) {
                System.out.print("Deseja cadastrar outro aluno? (s/n): ");
                String resposta = scanner.next();

                if (!resposta.equalsIgnoreCase("s")) {
                    break;
                }
            } else {
                System.out.println("Limite de alunos atingido. Cadastro encerrado.");
            }
        }

        System.out.println("Cadastro de alunos finalizado. Total de alunos cadastrados: " + new Alunos());
    }
}



