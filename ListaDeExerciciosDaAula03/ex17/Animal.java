package ListaDeExerciciosDaAula03.ex17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar() {
        System.out.println("O animal está sendo alimentado.");
    }

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}
