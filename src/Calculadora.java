import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa calculadora");
		Scanner leitor = new Scanner(System.in);
		
		int valor1, valor2, soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("Por favor, digiete o primeiro valor");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, digiete o segundo valor");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double)valor2;
		
		System.out.println("A soma dos valores � " + soma);
		System.out.println("A subtra��o dos valores � " + subtracao);
		System.out.println("A multica��o dos valores � " + multiplicacao);
		System.out.println("A divis�o dos valores � " + divisao);
		
		leitor.close();
	}

}
