package application;

import java.util.Scanner;

import entities._13_Product;

public class _13_exercício_Vetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		_13_Product[] vect = new _13_Product[n];
		
		for(int i =0; i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new _13_Product(name,price);
		}
		
		double sum = 0;
		for (int i=0; i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		sc.close();
	}

}
