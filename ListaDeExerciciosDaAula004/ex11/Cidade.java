package ex11;
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

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @java.lang.Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }
}
