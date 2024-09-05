package ex6;

import ListaDeExerciciosDaAula03.ex6.Computador;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD Ryzen", 16, 2000);
        System.out.println(computador);
        computador.desligar();
    }
}
