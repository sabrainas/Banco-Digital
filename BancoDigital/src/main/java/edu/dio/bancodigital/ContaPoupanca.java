package edu.dio.bancodigital;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirConta() {
        System.out.println("====================");
        System.out.println("Extrato Conta Poupança");
        System.out.println("Agencia: " + getAgencia()); //ou
        System.out.println("Numero: " + super.numero);
        System.out.printf("Saldo: R$ %.2f", super.saldo);
        System.out.println("\n====================");
    }
}
