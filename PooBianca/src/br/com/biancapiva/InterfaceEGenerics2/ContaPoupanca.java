package br.com.biancapiva.InterfaceEGenerics2;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
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

}
