package ex22;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;
    private ArrayList<String> funcionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public ArrayList<String> getFuncionarios() {
        return funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void setFuncionarios(ArrayList<String> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @java.lang.Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                ", funcionarios=" + funcionarios +
                '}';
    }

    public void contratarFuncionario(String funcionario) {
        funcionarios.add(funcionario);
        numeroFuncionarios++;
        System.out.println("Funcionário " + funcionario + " contratado.");
    }

    public void demitirFuncionario(String funcionario) {
        if (funcionarios.remove(funcionario)) {
            numeroFuncionarios--;
            System.out.println("Funcionário " + funcionario + " demitido.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
