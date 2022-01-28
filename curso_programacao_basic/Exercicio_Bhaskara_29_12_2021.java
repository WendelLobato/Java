import java.util.Scanner;

public class Exercicio_Bhaskara_29_12_2021 {

	public static void main(String[] args) {

		Scanner conta = new Scanner(System.in);
		double b, a, c, delta, x1, x2;
		
		System.out.println("Digite os valores de a, b e c, respectivamente");
		a = conta.nextDouble();
		b = conta.nextDouble();
		c = conta.nextDouble();
		
		delta = b * b - 4 * a *c ;
		x1 = (-b + Math.sqrt(delta))/(2*a);
		x2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.printf("R1 = %.5f %n", x1);
		System.out.printf("R2 = %.5f", x2);
		 
		
		conta.close();
	}

}
