package ex10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @java.lang.Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    public void abastecer() {
        System.out.println("Veículo abastecido.");
    }

    public void lavar() {
        System.out.println("Veículo lavado.");
    }
}
