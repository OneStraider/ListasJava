package ex10;

import ex9.Produto;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("SUV", "2A432F3", "Preto");
        System.out.println(veiculo);
        veiculo.abastecer();
    }
}
