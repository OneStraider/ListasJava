package ListaDeExerciciosDaAula03.ex15;

public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("ListaDeExercíciosDaAula03.ex15.Jogo " + nome + " iniciado.");
    }

    public void pausar() {
        System.out.println("ListaDeExercíciosDaAula03.ex15.Jogo " + nome + " pausado.");
    }
}
