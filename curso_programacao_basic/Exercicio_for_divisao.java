import java.util.Scanner;

public class Exercicio_for_divisao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0;i<=N;i++) {
			
			double n1 = sc.nextInt();
			double n2 = sc.nextInt();
			
			if (n2 == 0) {
				System.out.println("Divisão Impossível");
			} else {
			
			double divisao = n1/n2;
			System.out.println(divisao);
			}
		}
		
		sc.close();
	}

}
