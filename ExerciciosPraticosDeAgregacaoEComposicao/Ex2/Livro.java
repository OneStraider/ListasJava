package ExerciciosPraticosDeAgregacaoEComposicao.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void adicionarPagina(int numero, String conteudo) {
        Pagina pagina = new Pagina(numero, conteudo);
        this.paginas.add(pagina);
        System.out.println("Página " + numero + " adicionada com sucesso!");
    }

    public void exibirPagina(int numero) {
        for (Pagina pagina : paginas) {
            if (pagina.getNumero() == numero) {
                System.out.println("Página " + numero + ": " + pagina.getConteudo());
                return;
            }
        }
        System.out.println("Página não encontrada.");
    }

    public void exibirTodasPaginas() {
        for (Pagina pagina : paginas) {
            System.out.println("Página " + pagina.getNumero() + ": " + pagina.getConteudo());
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totalPaginas=" + paginas.size() +
                '}';
    }
}
