package ListaDeExerciciosDaAula03.ex14;

import java.util.ArrayList;

public class Time {
    private String nome;
    private String tecnico;
    private ArrayList<String> jogadores;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(String jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador " + jogador + " adicionado ao time.");
    }

    public void removerJogador(String jogador) {
        if (jogadores.remove(jogador)) {
            System.out.println("Jogador " + jogador + " removido do time.");
        } else {
            System.out.println("Jogador não encontrado no time.");
        }
    }
}
