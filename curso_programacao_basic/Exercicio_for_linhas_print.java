import java.util.Scanner;

public class Exercicio_for_linhas_print {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1;i<= N;i++) {
			
			int q = i*i;
			int c = i*i*i;
			
			System.out.printf("%d %d %d %n",i,q,c);
			
		}
		
		sc.close();
	}

}
