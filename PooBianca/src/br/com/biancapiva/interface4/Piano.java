package br.com.biancapiva.interface4;

public class Piano implements InstrumentoMusical {

    public Piano() {
    }

    @Override
    public String tocar() {
        return "DoReMiFaSol";
    }

    @Override
    public String afinar() {
        return "Afinando...";
    }

}
