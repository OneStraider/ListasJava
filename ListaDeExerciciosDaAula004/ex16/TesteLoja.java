package ex16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Americanas", "rua 1212", "4592149124");
        System.out.println(loja);
        loja.fechar();
    }
}
