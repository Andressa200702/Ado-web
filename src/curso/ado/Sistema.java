package curso.ado;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(String nome, int idade, String cpf, String email, String senha) {
        Usuario usuario = new Usuario();

        usuario.nome = nome;
        usuario.idade = idade;
        usuario.cpf = cpf;
        usuario.email = email;
        usuario.senha = senha;

        usuarios.add(usuario);
        System.out.println("Usuário cadastrado!");
    }

    public void logar(String email, String senha) {

        for (Usuario usuario : usuarios) {
            if (usuario.email.equals(email) && usuario.senha.equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                return;
            }
        }

        System.out.println("E-mail ou senha incorretos.");
    }
}

