package ExerciciosPraticosDeAgregacaoEComposicao.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro("Livro Massa", "Willian");

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar página");
            System.out.println("2. Ver conteúdo de uma página");
            System.out.println("3. Ver conteúdo de todas as páginas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da página: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha
                    System.out.print("Digite o conteúdo da página: ");
                    String conteudo = scanner.nextLine();
                    livro.adicionarPagina(numero, conteudo);
                    break;
                case 2:
                    System.out.print("Digite o número da página que deseja ver: ");
                    int numeroPagina = scanner.nextInt();
                    livro.exibirPagina(numeroPagina);
                    break;
                case 3:
                    System.out.println("Conteúdo de todas as páginas:");
                    livro.exibirTodasPaginas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}
