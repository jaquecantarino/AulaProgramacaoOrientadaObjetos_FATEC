package Conta;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta(12345, "Agency", 2, "POOBank", 129, 2, 0);
		
		int nrConta;
		String nomeAgencia;
		int nrAgencia;
		String nomeBanco;
		int nrBanco;
		int tipo;
		float saldo;
		float valor;
		int opcao;
		
		//PEDINDO DADOS POR USUARIO//
		/*System.out.println("Bem Vindo!");
		System.out.println("Abrir Conta...");
		System.out.println("Digite o número da conta: ");
		nrConta = leia.nextInt();
		conta1.setNrConta(nrConta);
		System.out.println("Digite o nome da Agencia: ");
		nomeAgencia = leia.next();
		conta1.setNomeAgencia(nomeAgencia);
		System.out.println("Digite o nome do Banco: ");
		nomeBanco = leia.next();
		conta1.setNomeBanco(nomeBanco);
		System.out.println("Digite o número do Baanco: ");
		nrBanco = leia.nextInt();
		conta1.setNrBanco(nrBanco);
		System.out.println("Digite o tipo de conta | 1-Corrente, 2-Poupança; 3-Conjunta, 4-Conta encerrada :");
		tipo = leia.nextInt();
		conta1.setTipo(tipo);
		saldo = 0;
		conta1.setSaldo(saldo);
		
		
		System.out.println(conta1.toString());*/
		System.out.println(conta2.toString());
		
		System.out.println("Digite uma opção: 1- Crédito 2-Débito");
		opcao = leia.nextInt();
		System.out.println("Digite o valor da operação: ");
		valor = leia.nextInt();
		
		if(opcao == 1) {
			conta2.creditar(valor);
		} else if( opcao == 2) {
			conta2.debitar(valor);
		} else {
			System.out.println("Opção Invalida!");
		}
		
		
		conta2.consultaSaldo();
		
		conta2.encerrar();
		
		
		
		
		
		
		

	}

}
