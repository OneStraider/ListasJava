package ex16;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean aberta;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aberta = false;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    @java.lang.Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", aberta=" + aberta +
                '}';
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("ListaDeExercíciosDaAula03.ex16.Loja aberta.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("ListaDeExercíciosDaAula03.ex16.Loja fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }
}
