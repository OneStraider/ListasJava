package ListaDeExerciciosDaAula03.ex1;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrir() {
        paginaAtual = 1;
        System.out.println("Livro aberto na página " + paginaAtual);
    }

    public void lerPagina() {
        if (paginaAtual < numeroDePaginas) {
            System.out.println("Lendo página " + paginaAtual);
            paginaAtual++;
        } else {
            System.out.println("Você chegou ao final do livro.");
        }
    }
}
