package br.com.biancapiva.InterfaceEGenerics2;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        double valor = 10000;

        conta.depositar(valor);

        System.out.println(conta.getSaldo());
        System.out.println(conta.calcularTributos());

        SeguroDeVida seguro = new SeguroDeVida();

        System.out.println(seguro.calcularTributos());


    }
}
