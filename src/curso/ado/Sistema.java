package curso.ado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Cursos> cursos = new ArrayList<>();
    private int proximoIdCurso = 1;

    private void cadastrar(String nome, int idade, String cpf, String email, String senha) {
        if (nome == null || nome.isEmpty() || email == null || email.isEmpty()
                || senha == null || senha.isEmpty()) {
            System.out.println("Nome, e-mail e senha são obrigatórios.");
            return;
        }

        for (Usuario u : usuarios) {
            if (u.email.equals(email)) {
                System.out.println("Já existe um usuário cadastrado com esse e-mail.");
                return;
            }
        }

        Usuario usuario = new Usuario();
        usuario.nome = nome;
        usuario.idade = idade;
        usuario.cpf = cpf;
        usuario.email = email;
        usuario.senha = senha;

        usuarios.add(usuario);
        System.out.println("Usuário cadastrado!");
    }

    private Usuario logar(String email, String senha) {
        Usuario encontrado = null;
        for (Usuario u : usuarios) {
            if (u.email.equals(email)) {
                encontrado = u;
                break;
            }
        }

        if (encontrado == null) {
            System.out.println("Usuário não encontrado.");
            return null;
        }

        if (!encontrado.senha.equals(senha)) {
            System.out.println("Senha inválida.");
            return null;
        }

        System.out.println("Login realizado com sucesso!");
        return encontrado;
    }

    public void cadastrarCurso(String titulo, String descricao, String horas) {
        Cursos curso = new Cursos(proximoIdCurso, titulo, descricao, horas);
        cursos.add(curso);
        proximoIdCurso++;
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso disponível.");
            return;
        }
        for (Cursos c : cursos) {
            System.out.println("[" + c.getIdCurso() + "] " + c.getTituloCurso() + " - " + c.getDescricaoCurso());
        }
    }

    public Cursos buscarCursoPorId(int idCurso) {
        for (Cursos c : cursos) {
            if (c.getIdCurso() == idCurso) {
                return c;
            }
        }
        System.out.println("Curso não encontrado.");
        return null;
    }

    public void inscrever(Usuario usuario, int idCurso) {
        Cursos curso = buscarCursoPorId(idCurso);
        if (curso == null) {
            return;
        }
        usuario.inscricaoCurso(curso.getIdCurso(), curso.getTituloCurso());
    }

    public void executar(Scanner sr) {
        Usuario usuarioLogado = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n1- Cadastrar usuário");
            System.out.println("2- Login");
            System.out.println("0- Sair");
            System.out.print("Opção: ");
            opcao = sr.nextInt();
            sr.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sr.nextLine();
                    System.out.print("Idade: ");
                    int idade = sr.nextInt();
                    sr.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sr.nextLine();
                    System.out.print("E-mail: ");
                    String email = sr.nextLine();
                    System.out.print("Senha: ");
                    String senha = sr.nextLine();
                    cadastrar(nome, idade, cpf, email, senha);
                    break;

                case 2:
                    System.out.print("E-mail: ");
                    String emailLogin = sr.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = sr.nextLine();
                    usuarioLogado = logar(emailLogin, senhaLogin);

                    if (usuarioLogado != null) {
                        menuCursos(sr, usuarioLogado);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void menuCursos(Scanner sr, Usuario usuario) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== Cursos disponíveis =====");
            listarCursos();
            System.out.println("\n1- Ver detalhes de um curso");
            System.out.println("2- Inscrever-se em um curso");
            System.out.println("0- Voltar");
            System.out.print("Opção: ");
            opcao = sr.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Id do curso: ");
                    int idVer = sr.nextInt();
                    Cursos curso = buscarCursoPorId(idVer);
                    if (curso != null) {
                        System.out.println("Título: " + curso.getTituloCurso());
                        System.out.println("Descrição: " + curso.getDescricaoCurso());
                        System.out.println("Carga horária: " + curso.getHorasCurso() + "h");
                    }
                    break;

                case 2:
                    System.out.print("Id do curso: ");
                    int idInscricao = sr.nextInt();
                    inscrever(usuario, idInscricao);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
