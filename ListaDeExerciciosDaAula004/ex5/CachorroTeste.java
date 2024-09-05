package ex5;

import ListaDeExerciciosDaAula03.ex5.Cachorro;

public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Douglas", "Pinscher", 5);
        System.out.println(cachorro);
        cachorro.latir();
        cachorro.correr();
    }
}
