import java.util.Scanner;

public class Exercicio_for_valores_peso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i<= N; i++) {
			
			double c1 = sc.nextDouble();
			double c2 = sc.nextDouble();
			double c3 = sc.nextDouble();
			
			double resultado = ((c1*2)+(c2*3)+(c3*5))/10;
			
			System.out.printf("%.1f %n",resultado);
			
		}
		
		sc.close();
	}

}
