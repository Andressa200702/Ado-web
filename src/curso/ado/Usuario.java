package curso.ado;

public class Usuario {
    public String nome;
    public int idade;
    public String cpf;
    public String email;
    public String senha;

    public void inscricaoCurso(int idCurso, String tituloCurso) {
        System.out.println(nome + " se inscreveu no curso ID " + idCurso
                + " de " + tituloCurso);
    }
}
