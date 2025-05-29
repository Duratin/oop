package br.com.biancapiva.InterfaceEGenerics1;

public abstract class Funcionario implements Trabalhador {
    private double salario;

    public Funcionario() {
    }

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
