package br.com.biancapiva.Interface5;

public class ArquivoAudio implements Arquivo {

    public ArquivoAudio() {
    }

    @Override
    public String abrir() {
        return "Abrindo...";
    }

    @Override
    public String fechar() {
        return "Fechado...";
    }

    @Override
    public String ler() {
        return "Lendo...";
    }
}
