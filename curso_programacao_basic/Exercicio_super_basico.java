import java.util.Scanner;

public class Exercicio_super_basico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
		
		
		System.out.println("Soma = " + soma);
		
		sc.close();
	}

}
