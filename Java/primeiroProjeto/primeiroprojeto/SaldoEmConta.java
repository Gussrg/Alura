package primeiroprojeto;

import java.util.Scanner;

public class SaldoEmConta {
	public static void main(String[] args) {
	
	String nome = "Barry Allen", tipoConta = "Corrente";
	double saldo = 1599.99;
	int opcao = 0;
	
	System.out.println("*******************************");
	System.out.println("\nCliente:" + nome);
	System.out.println("Tipo de conta:" + tipoConta);
	System.out.println("\nSaldo em conta:" + saldo);
	System.out.println("\n*******************************");
	
	String menu = """
			** DIGITE SUA OPÇÃO **
			1 - CONSULTAR SALDO
			2 - TRANSFERIR VALOR
			3 - RECEBER VALOR
			4 - SAIR
			""";
	System.out.println(menu);
	
	Scanner leitura = new Scanner(System.in);
	opcao = leitura.nextInt();
	
	switch(opcao) {
		case 1:
			System.out.println("Consultar saldo");
			break;
		case 2:
			System.out.println("Transferir valor");
			break;
		case 3:
			System.out.println("receber valor");
			break;
		case 4:
			System.out.println("saindo...");
			break;
			default:
				System.out.println("Opção invalida");
				break;
	}
	} 

}
