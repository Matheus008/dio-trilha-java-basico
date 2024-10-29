package program;

import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Matheus");
		
		Conta cc = new ContaCorrente(cliente);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(cliente);
		cc.transferir(cp, 100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
