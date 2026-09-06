package curso.ado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Sistema sistema = new Sistema();

        // cursos de exemplo
        sistema.cadastrarCurso("Python", "Introdução à lógica e sintaxe em Python", "40");
        sistema.cadastrarCurso("Java", "Programação orientada a objetos com Java", "60");
        sistema.cadastrarCurso("SQL", "Consultas e modelagem de banco de dados", "30");

        sistema.executar(sr);
    }
}