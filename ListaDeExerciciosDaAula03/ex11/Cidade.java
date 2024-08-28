package ListaDeExerciciosDaAula03.ex11;
public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        populacao += quantidade;
        System.out.println("População aumentada para " + populacao);
    }

    public void diminuirPopulacao(int quantidade) {
        if (populacao >= quantidade) {
            populacao -= quantidade;
            System.out.println("População diminuída para " + populacao);
        } else {
            System.out.println("Quantidade insuficiente para diminuir.");
        }
    }
}
