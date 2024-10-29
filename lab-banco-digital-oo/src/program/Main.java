package program;

import java.util.ArrayList;
import java.util.List;

import banco.Banco;
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
		cc.depositar(200);
		
		Conta cp = new ContaPoupanca(cliente);
		cc.transferir(cp, 200);
		
		List<Conta> contas = new ArrayList<>();
		contas.add(cc);
		contas.add(cp);
		
		Banco banco = new Banco("Inter", contas);
		
		banco.imprimirResumo();
	}

}
