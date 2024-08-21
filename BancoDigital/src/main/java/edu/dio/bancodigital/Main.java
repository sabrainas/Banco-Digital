package edu.dio.bancodigital;

public class Main {
    public static void main(String[] args) {

        Cliente sabrina = new Cliente();
        sabrina.setNome("Sabrina");

        Conta cc = new ContaCorrente(sabrina);
        Conta cp = new ContaPoupanca(sabrina);

        cc.imprimirConta();
        cp.imprimirConta();

        cc.depositar(100);
        cp.depositar(200);

        cc.imprimirConta();
        cp.imprimirConta();

        cc.transferir(50, cp);

        cc.imprimirConta();
        cp.imprimirConta();

    }
}
