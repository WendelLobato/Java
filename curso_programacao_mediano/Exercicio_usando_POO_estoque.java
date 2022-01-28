package curso_programacao_mediano;

import java.util.Scanner;

import entities.Product;

public class Exercicio_usando_POO_estoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product Data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.printf("Product data: " + product );
		
		System.out.println("\nEnter the number of product to be added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProduts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
