package primeiroprojeto;

public class Main {

	public static void main(String[] args) {
		
		int anoDeLancamento =2022;
		double notaDoFilme = 8.1;
		boolean incluidoNoPlano = true;
		
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: Top gun: Maverick");		
		System.out.println("Ano de lançamento:" + anoDeLancamento);
		System.out.println("Nota do filme:" + notaDoFilme);
		
		double media = (9.8 + 6.3 + 8) /3;
		System.out.println(media);
		String sinopse;
		sinopse ="""
				Filme de aventura com galã dos anos 80
				ano de lançamento:
				""" + anoDeLancamento;
		System.out.println(sinopse);
		
		int classificacao = (int) (media /2);
		System.out.println(classificacao);
		
		double celsius = 28, fahrenheit = ((celsius *1.8)+32);
		System.out.println("a temperatura é " + fahrenheit);
		
	}

}
