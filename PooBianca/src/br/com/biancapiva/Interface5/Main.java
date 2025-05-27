package br.com.biancapiva.Interface5;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Arquivo> arquivos = new ArrayList<>();

        arquivos.add(new ArquivoTexto());
        arquivos.add(new ArquivoImagem());
        arquivos.add(new ArquivoAudio());

        // Iterando sobre a coleção
        for (Arquivo arq : arquivos) {
            arq.abrir();
            arq.ler();
            arq.fechar();
            System.out.println("---");
        }
    }

    }
