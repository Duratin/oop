package br.com.biancapiva.Interface1;

public class Bicicleta implements Veiculo{
    public Bicicleta() {
    }

    @Override
    public String acelerar() {
        System.out.println("Acelerando...");
        return "";
    }

    @Override
    public String frear() {
        System.out.println("Freando...");
        return "";
    }

    @Override
    public String virar(String direcao) {
        System.out.println("Virando para " + direcao);
        return direcao;
    }
}
