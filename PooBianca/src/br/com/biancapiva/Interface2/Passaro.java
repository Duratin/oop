package br.com.biancapiva.Interface2;

public class Passaro implements Animal{

    private String nome;

    public Passaro() {
    }

    public Passaro(String nome) {
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
        System.out.println("PiuPiu");
        return "";
    }

    @Override
    public String mover() {
        System.out.println("Andando...");
        return "";
    }
}

