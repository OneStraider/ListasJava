package ex4;

public class ContaBancaria {
    private String numeroConta;
    private Float saldo;

    public ContaBancaria(String numeroConta, Float saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(Float valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(Float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public java.lang.Float getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(java.lang.Float saldo) {
        this.saldo = saldo;
    }

    @java.lang.Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}