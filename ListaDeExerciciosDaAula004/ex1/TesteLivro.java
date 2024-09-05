package ex1;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Carros", "Pixar", 6);
        System.out.println(livro);
        livro.som();
    }
}
