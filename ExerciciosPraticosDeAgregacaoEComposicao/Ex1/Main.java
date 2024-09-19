package ExerciciosPraticosDeAgregacaoEComposicao.Ex1;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1600, "Motor Turbo", 0, 150, false, TipoCombustivel.GASOLINA);
        Carro carro = new Carro("Carro Esportivo", motor);

        carro.setLigarCarro(true);
        carro.setAcionarAcelerador(true);
        carro.setTrocaMarchar(2);
        carro.setAcionarFreio(true);

        System.out.println(motor);
    }
}