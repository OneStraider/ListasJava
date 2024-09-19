package ExerciciosPraticosDeAgregacaoEComposicao.Ex1;

public class Carro {
    private String modelo;
    private boolean acionarFreio;
    private boolean acionarAcelerador;
    private int trocaMarchar;
    private boolean ligarCarro;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
        this.trocaMarchar = 1;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isAcionarFreio() {
        return acionarFreio;
    }

    public void setAcionarFreio(boolean acionarFreio) {
        if (!acionarAcelerador) {
            this.acionarFreio = acionarFreio;
            motor.reduzirRpm(500);
            System.out.println("Freio acionado.");
        } else {
            System.out.println("Não é possível acionar o freio enquanto acelera!");
        }
    }

    public boolean isAcionarAcelerador() {
        return acionarAcelerador;
    }

    public void setAcionarAcelerador(boolean acionarAcelerador) {
        if (!acionarFreio) {
            this.acionarAcelerador = acionarAcelerador;
            motor.acelerar(1000);
            System.out.println("Acelerador acionado.");
        } else {
            System.out.println("Não é possível acelerar enquanto o freio está acionado!");
        }
    }

    public int getTrocaMarchar() {
        return trocaMarchar;
    }

    public void setTrocaMarchar(int trocaMarchar) {
        if (trocaMarchar >= 1 && trocaMarchar <= 5) {
            this.trocaMarchar = trocaMarchar;
            System.out.println("Marcha trocada para: " + trocaMarchar);
        } else {
            System.out.println("Marcha inválida. Escolha entre 1 e 5.");
        }
    }

    public boolean isLigarCarro() {
        return ligarCarro;
    }

    public void setLigarCarro(boolean ligarCarro) {
        if (!this.ligarCarro) {
            this.ligarCarro = ligarCarro;
            motor.ligar();
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligarCarro() {
        if (ligarCarro) {
            this.ligarCarro = false;
            motor.desligar();
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado!");
        }
    }
}