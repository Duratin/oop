package br.com.biancapiva.InterfaceEGenerics1;

public class Vendedor extends Funcionario{

    public Vendedor() {
    }

    public Vendedor(double salario) {
        super(salario);
    }

    @Override
    public String trabalhar() {
        return "Trabalhado";
    }

    @Override
    public String descansar() {
        return "Descansando";
    }
}
