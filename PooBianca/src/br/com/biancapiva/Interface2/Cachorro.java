package br.com.biancapiva.Interface2;

public class Cachorro implements Animal{


    private String nome;


    public Cachorro(String nome) {
        this.nome = nome;
    }

    public Cachorro() {
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
        System.out.println("AuAu");
        return "";
    }

    @Override
    public String mover() {
        System.out.println("Andando...");
        return "";
    }
}
