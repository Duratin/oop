package br.com.biancapiva.Interface1;

public class Carro implements Veiculo {
    public Carro() {
    }

    @Override
    public String acelerar() {
        System.out.println("Carro acelerado");
        return "";
    }

    @Override
    public String frear() {
        System.out.println("Carro freado");
        return "";
    }

    @Override
    public String virar(String direcao) {
        System.out.println("Carro virado para " + direcao);
        return direcao;
    }
}
