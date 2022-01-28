import java.util.Scanner;

public class w_Sintaxe_opcional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();

		double conta = 50;

		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();
	}

}
