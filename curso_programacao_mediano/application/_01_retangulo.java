package application;

import java.util.Scanner;

import entities._01_Triangulo;

public class _01_retangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		_01_Triangulo triangulo = new _01_Triangulo();
		
		triangulo.weight = sc.nextDouble();
		triangulo.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", triangulo.area());
		System.out.printf("Perimeter = %.2f%n", triangulo.perimeter());
		System.out.printf("Diagonal: %.2f%n", triangulo.diagonal());
		
		
		sc.close();
	}

}
