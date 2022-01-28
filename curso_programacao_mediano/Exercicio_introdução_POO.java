package curso_programacao_mediano;

import java.util.Scanner;

public class Exercicio_introdução_POO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X: ");
		 double a = sc.nextDouble();
		 double b = sc.nextDouble();
		 double c = sc.nextDouble();
		 
		 System.out.println("Enter the measures of triangle Y: ");
		 double A = sc.nextDouble();
		 double B = sc.nextDouble();
		 double C = sc.nextDouble();
		 
		 
		double p = (a+b+c)/2;
		double X = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		double P = (A+B+C)/2;
		double Y =  Math.sqrt(P*(P-A)*(P-B)*(P-C));
		
		System.out.printf("Triangle X Area: %f %n",X);
		System.out.printf("Triangle Y Area: %f",Y);
		
		if (X>Y) {
			System.out.println("Larger Area: X");
		} else {
			System.out.println("Larger Area: Y");
		}
		
		
		 
		
		sc.close();
	}

}
