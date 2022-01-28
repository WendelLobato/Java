import java.util.Scanner;

public class Exercicio_maior_numero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * int n1 = sc.nextInt(); int n3 = sc.nextInt(); int n2 = sc.nextInt();
		 * 
		 * if(n1>n2 && n1>n3) { System.out.println(n1); }else if (n2>n3) {
		 * System.out.println(n2); } else { System.out.println(n3); }
		 */

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int higher = max(n1, n2, n3);
		
		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		// public =seja livre em todas as classes. 
		// static é que essa função seja chamada independentemente de objeto.

		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println(value);
	}

}
