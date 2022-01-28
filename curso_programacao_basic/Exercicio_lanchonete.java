import java.util.Scanner;

public class Exercicio_lanchonete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cP = sc.nextInt();
		int qtd = sc.nextInt();
		double valor = 0;
		
		switch(cP) {
		case 1:
			valor = 4.00;
			break;
		case 2:
			valor = 4.50;
			break;
		case 3:
			valor = 5.00;
			break;
		case 4:
			valor = 2.00;
			break;
		case 5:
			valor = 1.50;
			break;
		default:
			System.out.println("Escreva um código de produto válido");
			break;
		}
		double total = valor * qtd;
		System.out.printf("Total: R$ %.2f",total);
		sc.close();
	}

}
