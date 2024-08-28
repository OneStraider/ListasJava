package ListaDeExerciciosDaAula03.ex12;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("ListaDeExercíciosDaAula03.ex12.Filme " + titulo + " iniciado.");
    }

    public void parar() {
        System.out.println("ListaDeExercíciosDaAula03.ex12.Filme " + titulo + " parado.");
    }
}
