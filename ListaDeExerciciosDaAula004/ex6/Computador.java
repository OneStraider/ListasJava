package ex6;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private boolean ligado;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Computador ligado.");
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Computador desligado.");
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @java.lang.Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", armazenamento=" + armazenamento +
                ", ligado=" + ligado +
                '}';
    }
}
