import java.util.Scanner;

public class Exercicio_for_contador {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.close();

		for (int i = 1; i <= x; i = i +2) {
			System.out.println(i);
		}
	}

}
