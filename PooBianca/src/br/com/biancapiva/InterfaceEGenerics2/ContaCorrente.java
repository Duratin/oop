package br.com.biancapiva.InterfaceEGenerics2;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double depositar(double valor) {
        return super.depositar(valor);
    }

    @Override
    public double sacar(double valor) {
        return super.sacar(valor);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public double calcularTributos() {
        return saldo * 0.01;
    }
}
