package br.com.biancapiva.interface4;

public class Flauta implements InstrumentoMusical{

    public Flauta() {
    }

    @Override
    public String tocar() {
        return "Fufufufu";
    }

    @Override
    public String afinar() {
        return "Afinando...";
    }
}
