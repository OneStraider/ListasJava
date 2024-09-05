package ex12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("1917", "Joaozinho", 2);
        System.out.println(filme);
        filme.iniciar();
    }
}
