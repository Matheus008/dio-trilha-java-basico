package one.digitalinnovation.gof;

import one.digitalinnovation.gof.conta.ContaCorrente;
import one.digitalinnovation.gof.usuario.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente;
		cliente = new Cliente("Matheus", "9999999999", new ContaCorrente());
		cliente.getConta().depositar();
		cliente.getConta().sacar();
	}

}
