package ex19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @java.lang.Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                ", aberto=" + aberto +
                '}';
    }

    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("Livro digital " + titulo + " aberto.");
        } else {
            System.out.println("O livro digital já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("Livro digital " + titulo + " fechado.");
        } else {
            System.out.println("O livro digital já está fechado.");
        }
    }
}
