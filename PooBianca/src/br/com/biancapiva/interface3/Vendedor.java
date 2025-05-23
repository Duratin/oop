package br.com.biancapiva.interface3;

public class Vendedor extends  Funcionario{

    public Vendedor() {
    }

    public Vendedor(double salario) {
        super(salario);
    }

    @Override
    public String trabalhar() {
        setSalario(getSalario()*2);
        return "Parabens pelo trabalho veja seu saldo" ;
    }

    @Override
    public String descansar() {
        return "zzzzz....";
    }
}
