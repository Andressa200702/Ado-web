package curso.ado;

public class Usuario {
    String nome;
    int idade;
    String cpf;
    String email;
    String senha;

    public void inscricaoCurso(int idCurso, String tituloCurso) {
        System.out.println(nome + " se inscreveu no curso ID " + idCurso
                + " de " + tituloCurso);
    }

}

