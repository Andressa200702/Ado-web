package curso.ado;

public class Main {
     public static void main(String[] args) {
         Sistema sistema= new Sistema();

         sistema.cadastrar("Andressa Xavier", 23, "232.323.353-33",
                 "andressasx02@gmail.com", "selfme2026" );

         sistema.logar("andressasx02@gmail.com", "selfme2026");

         Usuario n1= new Usuario();
         n1.nome= "Andressa Xavier";
         n1.inscricaoCurso(1, "Python");

         Cursos curso = new Cursos(1, "Python", "40");

    }
}
