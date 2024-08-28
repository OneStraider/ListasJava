package ListaDeExerciciosDaAula03.ex16;

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
