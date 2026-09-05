package sistemaEscola;

public class Aluno {

    private final String nome;
    private final int idade;
    private final double nota1;
    private final double nota2;
    private final double nota3;

    public Aluno(String nome, int idade, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean AR() {
        return getMedia() >= 6.0;
    }

    @Override
    public String toString() {
        String situacao = AR() ? "APROVADO" : "REPROVADO";
        return nome + " - Idade: " + idade + " - Média: " + String.format("%.2f", getMedia()) + " - " + situacao;
    }
}