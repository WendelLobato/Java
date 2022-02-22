package application;

import java.util.Locale;
import java.util.Scanner;


import entities._09_Encapsulamento;

public class _09_Encapsulamento_app {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		double quantity = sc.nextInt();
		System.out.println();
		
		_09_Encapsulamento product = new _09_Encapsulamento(name, price);
		product.setName("Compute");
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		sc.close();
	}
}