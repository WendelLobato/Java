import java.util.Scanner;

public class Exercicio_horario_jogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int hora;
		
		
		if (v1 < v2) {
			hora = v2 - v1;
		} else {
			hora = 24 - v2 + v1;
		}
		
		System.out.printf("O jogo durou %d Horas", hora);
		sc.close();
	}

}
