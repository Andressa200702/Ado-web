package ado;

public class Tarefa {

    private final int id;
    String titulo;
    String descricao;
    boolean finalizado = false;

    public Tarefa(int id, String titulo, String descricao, boolean finalizado) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.finalizado = finalizado;
    }

        public int getID(){
            return id;
        }

        public String getTitulo(){
            return titulo;
        }

        public String getDescricao(){
            return titulo;
        }

        public boolean getFinalizado(){
            return finalizado;
        }
    }
}
