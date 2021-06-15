import java.util.Scanner;

public class RecebendoDados {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		System.out.println("Este programa ler dados");
		System.out.println("Por favor, digite o seu nome");
		nome = leitor.next();
		System.out.println("Que legal ter você aqui, " + nome);
		leitor.close();
	}

}
