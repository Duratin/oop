package br.com.biancapiva.InterfaceEGenerics3;

public class App {
    public static void main(String[] args) {
        Par<String, Double> aluno = new Par<>("João", 8.5);
        Par<Integer, String> funcionario = new Par<>(101, "Maria");
        Par<Float, Float> coordenadas = new Par<>(12.5f, 20.8f);
        Par<Boolean, String> status = new Par<>(true, "Ativo");
        Par<Character, Integer> letraNumero = new Par<>('A', 1);

        System.out.println(aluno);
        System.out.println(funcionario);
        System.out.println(coordenadas);
        System.out.println(status);
        System.out.println(letraNumero);
    }
}
