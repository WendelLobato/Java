import java.util.Scanner;

public class Exercicio_numeros_multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a = Math.abs(a);
		b = Math.abs(b);
		
		if (a % b == 0 || b % a  == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
