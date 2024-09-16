package banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeDoCliente;
		double saldo;
		
		System.out.println("Digite o número da conta: ");
		numero = sc.nextInt();
		
		System.out.println("Digite o número da agência: ");
		agencia = sc.next();
		
		System.out.println("Digite o nome do cliente: ");
		nomeDoCliente = sc.next();
		sc.next();
		
		System.out.println("Digite o saldo inicial: ");
		saldo = sc.nextDouble();
		
		
		System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
	}

}
