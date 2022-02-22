package application;

import java.util.Scanner;

import entities._05_Calculator;

public class _05_circulo_V2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		_05_Calculator calculator = new _05_Calculator();

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calculator.circunference(radius);
		double v = calculator.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);

		sc.close();
	}

}
