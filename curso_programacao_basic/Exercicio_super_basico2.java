import java.util.Scanner;

public class Exercicio_super_basico2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * (raio*raio);
		
		System.out.println("A = " + area);
		sc.close();
	}

}
