package ex17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @java.lang.Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }

    public void alimentar() {
        System.out.println("O animal está sendo alimentado.");
    }

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}
