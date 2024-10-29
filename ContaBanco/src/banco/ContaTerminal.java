package banco;

import java.util.Scanner;

public class ContaTerminal {

	/*public static void main(String[] args) {
		
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
	}*/
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();  
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        for(int i = 0; i < partes.length; i++) {

          if (partes[i].trim().equals(servico)) {
            System.out.println("Entrou no if");
            contratado = true;
            System.out.println(contratado);
          }

        }
        
        /*if (contratado){
          System.out.print("Sim");
        }else{
          System.out.print("Nao");
        }*/
        
        scanner.close();
    }

}
