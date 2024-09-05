package ex3;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gustavo", 23, 1.70);
        System.out.println(pessoa);
        pessoa.apresentar();
    }
}
