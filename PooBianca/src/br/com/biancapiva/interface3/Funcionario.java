package br.com.biancapiva.interface3;

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

    public double setSalario(double salario) {
        this.salario = salario;
        return salario;
    }
}
