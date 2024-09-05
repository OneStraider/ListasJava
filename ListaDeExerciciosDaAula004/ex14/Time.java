package ex14;

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

    public ArrayList<String> getJogadores() {
        return jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setJogadores(ArrayList<String> jogadores) {
        this.jogadores = jogadores;
    }

    @java.lang.Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", jogadores=" + jogadores +
                '}';
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
