package br.com.biancapiva.InterfaceEGenerics1;

public class Main {
    public static void main(String[] args) {
        Engenheiro en = new Engenheiro();
        Vendedor ven = new Vendedor();

        System.out.println(en.trabalhar());
        System.out.println(ven.trabalhar());
        System.out.println(en.descansar());
        System.out.println(ven.descansar());
    }
}
