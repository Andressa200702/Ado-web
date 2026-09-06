package curso.ado;

public class Cursos {

    private int idCurso;
    String tituloCurso;
    String descricaoCurso;
    String horasCurso;

    public Cursos(int idCurso, String tituloCurso, String descricaoCurso, String horasCurso) {
        this.idCurso = idCurso;
        this.tituloCurso = tituloCurso;
        this.descricaoCurso = descricaoCurso;
        this.horasCurso = horasCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public String getHorasCurso() {
        return horasCurso;
    }
}