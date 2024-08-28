package ListaDeExerciciosDaAula03.ex21;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("Cozinhando na cozinha " + tipo);
    }

    public void limpar() {
        System.out.println("Limpando a cozinha " + tipo);
    }
}
