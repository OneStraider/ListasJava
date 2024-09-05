package ex19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("Tudo de C", "Marcos", 3);
        System.out.println(livroDigital);
        livroDigital.abrir();
    }
}
