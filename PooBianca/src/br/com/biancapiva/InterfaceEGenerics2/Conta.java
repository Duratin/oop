package br.com.biancapiva.InterfaceEGenerics2;

public abstract class Conta {
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double depositar(double valor) {
        this.saldo += valor;
        return valor;
    }
    public double sacar(double valor) {
        this.saldo -= valor;
        return valor;
    }
}
