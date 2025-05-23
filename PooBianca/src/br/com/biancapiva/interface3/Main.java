package br.com.biancapiva.interface3;

public class Main {
    public static void main(String[] args) {

        Engenheiro en = new Engenheiro(1600);
        Vendedor ven = new Vendedor(1600);

        System.out.println(en.trabalhar());
        System.out.println(en.getSalario());
        System.out.println(en.descansar());


        System.out.println(ven.trabalhar());
        System.out.println(ven.getSalario());
        System.out.println(ven.descansar());
    }
}
