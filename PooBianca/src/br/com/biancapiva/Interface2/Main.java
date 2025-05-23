package br.com.biancapiva.Interface2;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Catoquinho");
        Gato gato = new Gato("Xana");
        Passaro passaro = new Passaro("Loro");

        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.mover());
        System.out.println(gato.emitirSom());
        System.out.println(gato.mover());
        System.out.println(passaro.emitirSom());
        System.out.println(passaro.mover());
    }
}
