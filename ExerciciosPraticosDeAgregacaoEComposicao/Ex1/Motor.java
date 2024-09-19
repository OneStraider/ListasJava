package ExerciciosPraticosDeAgregacaoEComposicao.Ex1;

public class Motor {
    private int cilindradas;
    private String modelo;
    private int rpm;
    private int potencia;
    private boolean ligado;
    private TipoCombustivel tipoCombustivel;

    public Motor(int cilindradas, String modelo, int rpm, int potencia, boolean ligado, TipoCombustivel tipoCombustivel) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.rpm = rpm;
        this.potencia = potencia;
        this.ligado = ligado;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String getModelo() {
        return modelo;
    }

    public int getRpm() {
        return rpm;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            rpm = 1000;
            System.out.println("Motor ligado. RPM inicial: " + rpm);
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            rpm = 0;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    public void acelerar(int incremento) {
        if (ligado) {
            rpm += incremento;
            System.out.println("Motor acelerado. RPM atual: " + rpm);
        } else {
            System.out.println("Não é possível acelerar um motor desligado.");
        }
    }

    public void reduzirRpm(int decremento) {
        if (ligado && rpm - decremento >= 800) {
            rpm -= decremento;
            System.out.println("RPM reduzido. RPM atual: " + rpm);
        } else if (!ligado) {
            System.out.println("O motor está desligado.");
        } else {
            System.out.println("RPM não pode ser reduzido abaixo do mínimo (800).");
        }
    }

    public void aumentarPotencia(int incremento) {
        if (ligado) {
            potencia += incremento;
            System.out.println("Potência aumentada. Potência atual: " + potencia);
        } else {
            System.out.println("O motor está desligado, não é possível aumentar a potência.");
        }
    }

    public void reduzirPotencia(int decremento) {
        if (ligado && potencia - decremento >= 0) {
            potencia -= decremento;
            System.out.println("Potência reduzida. Potência atual: " + potencia);
        } else {
            System.out.println("Potência já está no mínimo ou o motor está desligado.");
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindradas=" + cilindradas +
                ", modelo='" + modelo + '\'' +
                ", rpm=" + rpm +
                ", potencia=" + potencia +
                ", ligado=" + ligado +
                ", tipoCombustivel=" + tipoCombustivel +
                '}';
    }
}




