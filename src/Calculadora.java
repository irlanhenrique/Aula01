import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1, valor2;
		double soma, divisao, multiplicacao, subtracao;
		System.out.println("Por favor digite um valor");
		valor1 = leitor.nextDouble();
		
		System.out.println("Por favor digite mais um valor");
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / valor2;
		
		System.out.println("A soma dos 2 valores informados �,  " + soma );
		System.out.println("A subtra��o dos 2 valores informados �,  " + subtracao );
		System.out.println("A multiplica��o dos 2 valores informados �,  " + multiplicacao );
		System.out.println("A divis�o dos 2 valores informados �,  " + divisao );
		leitor.close();
	}

}
