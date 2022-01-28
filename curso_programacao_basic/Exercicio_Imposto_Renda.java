import java.util.Scanner;

public class Exercicio_Imposto_Renda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double imposto = 0;
		double salario = sc.nextDouble();

		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario >= 2000.01 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f", imposto);
		} else if (salario >= 3000.01 && salario <= 4500) {

			imposto = (((salario - 2000) - 1000) * 0.18) + (1000 * 0.08);
			System.out.printf("R$ %.2f", imposto);

		} else {
			imposto = (((salario - 2000) - 1000 - 1500) * 0.28) + (1000 * 0.08) + (1500 * 0.18);
			System.out.printf("R$ %.2f", imposto);
		}

		sc.close();
	}

}
