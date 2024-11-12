package one.digitalinnovation.gof.conta;

public class ContaSalario implements Conta{

	@Override
	public void sacar() {
		System.out.println("Saque realizado com sucesso");
	}

	@Override
	public void depositar() {
	System.out.println("Somente a empresa pode depositar nessa conta");
	}

}
