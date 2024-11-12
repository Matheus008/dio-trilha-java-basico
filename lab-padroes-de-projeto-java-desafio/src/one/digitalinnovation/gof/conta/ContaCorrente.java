package one.digitalinnovation.gof.conta;

public class ContaCorrente implements Conta{

	@Override
	public void sacar() {
		System.out.println("Saque realizado com sucesso");
	}

	@Override
	public void depositar() {
		System.out.println("deposito realizado com sucesso");
	}

}
