package ado;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoTarefas {
    public static void main(String[] args){
        ArrayList<Tarefa> listaTarefa = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int proximoId = 1;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=================LISTA DE TAREFAS=================");
            System.out.println("""
                    1- Adicionar tarefa
                    2- Listar todas as tarefas
                    3- Listar tarefas finalizadas
                    4- Remover tarefa
                    0- Sair""");

            opcao = sr.nextInt();
            sr.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Adicione uma tarefa:");
                    System.out.print("Título: ");
                    String titulo = sr.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sr.nextLine();
                    listaTarefa.add(new Tarefa(proximoId, titulo, descricao, false));
                    proximoId++;
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    System.out.println("Listando todas as tarefas...");
                    for (Tarefa t : listaTarefa) {
                        String status = t.getFinalizado() ? "Concluída" : "Pendente";
                        System.out.println("[" + t.getID() + "] " + t.getTitulo() + " - " + t.getDescricao() + " (" + status + ")");
                    }
                    break;

                case 3:
                    System.out.println("Listando tarefas finalizadas...");
                    for (Tarefa t : listaTarefa) {
                        if (t.getFinalizado()) {
                            System.out.println("[" + t.getID() + "] " + t.getTitulo() + " - " + t.getDescricao());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Remova uma tarefa:");
                    System.out.print("Id: ");
                    int idRemover = sr.nextInt();
                    listaTarefa.removeIf(t -> t.getID() == idRemover);
                    System.out.println("Tarefa removida (se existia)!");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}