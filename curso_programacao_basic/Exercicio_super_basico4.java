import java.util.Scanner;

public class Exercicio_super_basico4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = valor * horas;
		
		System.out.printf("Number = %d %n Salary = U$ %.2f",numero,salario);
		
		sc.close();
	}

}
