package br.com.biancapiva.interface4;

public class Violao implements InstrumentoMusical{

    public Violao() {
    }

    @Override
    public String tocar() {
        return "TanTanTan";
    }

    @Override
    public String afinar() {
        return "Afinando...";
    }
}
