package ex2;

public class CelularTeste {
    public static void main(String[] args) {
        Celular celular = new Celular("Apple", "Iphone15", 4000);
        System.out.println(celular);
        celular.desligar();
    }
}
