package ado;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoTarefas {
    public static void main(String[] args){

    ArrayList<Tarefa> listaTarefa = new ArrayList<>();
    Scanner sr = new Scanner(System.in);

    System.out.println("=================LISTA DE TAREFAS=================");
    System.out.println("""
                    1- Adicionar tarefa
                    2- Listar todas as tarefas
                    3- Listar tarefas finalizadas
                    4- Remover tarefa""");

    int opcao = sr.nextInt();

        switch (opcao) {
        case 1:
            System.out.println("Adicione uma tarefa:");
            break;
        case 2:
            System.out.println("Listando todas as tarefas...");
            break;
        case 3:
            System.out.println("Listando tarefas finalizadas...");
            break;
        case 4:
            System.out.println("Remova uma tarefa:");
            break;
        default:
            System.out.println("Opção inválida");
    }
 }
}