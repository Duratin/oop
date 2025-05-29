package br.com.biancapiva.InterfaceEGenerics1;

public class Engenheiro extends Funcionario{

    public Engenheiro() {
    }

    public Engenheiro(double salario) {
        super(salario);
    }

    @Override
    public String trabalhar() {
        return "Trabalando...";
    }

    @Override
    public String descansar() {
        return "Descansando...";
    }
}
