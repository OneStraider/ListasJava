package ex8;

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @java.lang.Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void darAula() {
        System.out.println("Professor " + nome + " está dando aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println("Professor " + nome + " está corrigindo provas.");
    }
}
