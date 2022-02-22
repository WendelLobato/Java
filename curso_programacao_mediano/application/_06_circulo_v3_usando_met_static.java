package application;

import java.util.Scanner;

import entities._06_Calculator;

public class _06_circulo_v3_usando_met_static {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = _06_Calculator.circunference(radius);    // DIFERENÇA: Não precisa chamar o objeto como antes, agora com static
		double v = _06_Calculator.volume(radius);		  // só precisa colocar o nome da classe.

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", _06_Calculator.PI);

		sc.close();
	}

}
