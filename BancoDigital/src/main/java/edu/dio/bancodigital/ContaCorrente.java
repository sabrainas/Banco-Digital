package edu.dio.bancodigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirConta() {
        System.out.println("====================");
        System.out.println("Extrato Conta Corrente");
        System.out.println("Agencia: " + getAgencia()); //ou
        System.out.println("Numero: " + super.numero);
        System.out.printf("Saldo: R$ %.2f", super.saldo);
        System.out.println("\n====================");
    }
}
