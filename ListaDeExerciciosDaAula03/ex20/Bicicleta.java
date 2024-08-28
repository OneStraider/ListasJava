package ListaDeExerciciosDaAula03.ex20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta " + marca + " " + modelo);
    }

    public void frear() {
        System.out.println("Freando a bicicleta " + marca + " " + modelo);
    }
}
