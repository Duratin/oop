package br.com.biancapiva.Interface1;

public class Main {
    public static void main(String[] args) {

        String direcao = "Direita";

        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        System.out.println(carro.frear());
        System.out.println(carro.acelerar());
        System.out.println(carro.virar(direcao));

        System.out.println(bicicleta.acelerar());
        System.out.println(bicicleta.virar(direcao));
        System.out.println(bicicleta.frear());


    }
}
