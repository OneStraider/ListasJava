package ListaDeExerciciosDaAula03.ex22;

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
