package banco;

import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome, List<Conta> contas) {
		this.nome = nome;
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void imprimirResumo() {
		for(Conta conta : this.contas) {
			System.out.println();
			System.out.println(String.format("Banco: %s" , nome));
			conta.imprimirExtrato();
		}
	}
	
}
