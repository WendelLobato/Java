package curso_programacao_mediano;

import java.util.Scanner;

import entities.Triangle;


public class Exercicio_usando_POO_P1 {

	public static void main(String[] args) {

		Triangle x,y;	
		
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X: ");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		 
		 System.out.println("Enter the measures of triangle Y: ");
		 y.a = sc.nextDouble();
		 y.b = sc.nextDouble();
		 y.c = sc.nextDouble();
		 
		 
		double X = x.area();
		double Y = y.area();
		
		
		System.out.printf("Triangle X Area: %f %n",X);
		System.out.printf("Triangle Y Area: %f %n",Y);
		
		if (X>Y) {
			System.out.println("Larger Area: X");
		} else {
			System.out.println("Larger Area: Y");
		}
		
		
		 
		
		sc.close();
	}

}
