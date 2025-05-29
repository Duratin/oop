package br.com.biancapiva.InterfaceEGenerics4;

public class App {
    public static void main(String[] args) {
        SimpleList<String> listaDeNomes = new SimpleList<>();

        listaDeNomes.add("Ana");
        listaDeNomes.add("Bruno");
        listaDeNomes.add("Carlos");

        for (int i = 0; i < listaDeNomes.size(); i++) {
            System.out.println("Elemento " + i + ": " + listaDeNomes.get(i));
        }

        System.out.println("Tamanho da lista: " + listaDeNomes.size());
    }
}
