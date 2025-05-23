package br.com.biancapiva.Interface2;

public class Gato implements Animal{

    private String nome;

    public Gato() {
    }

    public Gato(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String emitirSom() {
        System.out.println("MiauMiau");
        return "";
    }

    @Override
    public String mover() {
        System.out.println("Andando...");
        return "";
    }
}


