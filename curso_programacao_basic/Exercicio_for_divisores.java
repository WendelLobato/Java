import java.util.Scanner;

public class Exercicio_for_divisores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextInt();
		
		for (int i=0; i <=N ;i++) {
			
			double divisores = N%i;
			
			if(divisores == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
