package sistemaEscola;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listaAluno = new ArrayList<>();

        while (true) {
            System.out.println("==================SISTEMA DE NOTAS==================");
            System.out.println("Realize o cadastro dos alunos a seguir:");
            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();


            System.out.println("Digite a idade do aluno:");
            int idade = sc.nextInt();

            System.out.println("Digite a 1ª nota do aluno:");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a 2ª nota do aluno:");
            double nota2 = sc.nextDouble();

            System.out.println("Digite a 3ª nota do aluno:");
            double nota3 = sc.nextDouble();
            sc.nextLine();

            listaAluno.add(new Aluno(nome, idade, nota1, nota2, nota3));
            System.out.println();

            System.out.println("(Digite 'fim' para encerrar o cadastro)\n");

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
        }


        System.out.println("\n==================LISTA DE ALUNOS APROVADOS E REPROVADOS==================");
        for (Aluno aluno : listaAluno) {
            System.out.println(aluno);
        }

        sc.close();
    }
}