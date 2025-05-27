package br.com.biancapiva.interface4;

public class Main {
    public static void main(String[] args) {

        Piano p = new Piano();
        Violao v = new Violao();
        Flauta f = new Flauta();

        System.out.println(p.tocar());
        System.out.println(v.tocar());
        System.out.println(f.tocar());
        System.out.println(p.afinar());
        System.out.println(v.afinar());
        System.out.println(f.afinar());

    }
}
