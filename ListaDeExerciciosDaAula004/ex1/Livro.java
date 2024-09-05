package ex1;

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

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void abrir() {
        paginaAtual = 1;
        System.out.println("ex1.Livro aberto na página " + paginaAtual);
    }

    public void lerPagina() {
        if (paginaAtual < numeroDePaginas) {
            System.out.println("Lendo página " + paginaAtual);
            paginaAtual++;
        } else {
            System.out.println("Você chegou ao final do livro.");
        }
    }

    public void som() {
        System.out.println("Vrummmmm");
    }
    @java.lang.Override
    public String toString() {
        return "ex1.Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", paginaAtual=" + paginaAtual +
                '}';
    }
}