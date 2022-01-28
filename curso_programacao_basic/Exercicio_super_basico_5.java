import java.util.Scanner;

public class Exercicio_super_basico_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int numero = sc.nextInt();
		double valor = sc.nextDouble();

		int numero2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double soma = (numero * valor) + (numero2 * valor2);
		
		System.out.printf("Valor a pagar: %.2f",soma);
		
		sc.close();
	}

}
