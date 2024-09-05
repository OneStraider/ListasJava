package ex15;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("GTA", "RPG", 100);
        System.out.println(jogo);
        jogo.iniciar();
    }
}
