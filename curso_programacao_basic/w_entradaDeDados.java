import java.util.Scanner;

public class w_entradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String nome;
		double y;
		char s;
		// String x = sc.next();
		// int nome = sc.nextInt();
		System.out.print("Escreva seu nome: ");
		nome = sc.next();
		System.out.println("Escreva sua idade: ");
		x = sc.nextInt();
		System.out.println("Escreva qual valor da sua conta: ");
		y = sc.nextDouble();
		System.out.println("Qual seu sexo ? M/F");
		s = sc.next().charAt(0);

		System.out.println("Você digitou: " + x);
		System.out.println("Sua idade: " + nome);
		System.out.println("Sua conta tem: R$ " + y);
		System.out.println("Seu sexo é: " + s);
		sc.close();
	}

}
