package br.com.biancapiva.Interface5;

public class ArquivoTexto implements Arquivo {

    public ArquivoTexto() {
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
