package primeiroprojeto;

public class Condicional {
	
	public static void main(String[] args) {
		
		int anoDeLancamento =2021;
		double notaDoFilme = 8.1;
		boolean incluidoNoPlano = true;
		String tipoPlano ="plus";
		
		if(anoDeLancamento >= 2022) {
			System.out.println("Lançamento que os clientes estão curtindo!");
		} else {
			System.out.println("Filme retrô que vale a pena assistir");
		}
		
		if(incluidoNoPlano == true && tipoPlano.equals("plus")) {
			System.out.println("Filme liberado");
		}else {
			System.out.println("Necessário alugar o filme");
		}
	}
}
