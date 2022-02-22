package application;

import java.util.Scanner;

import entities._11_exercicio;

public class _11_exercico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		_11_exercicio s;
		
		System.out.println("Write solicited data");
		System.out.println("What´s you name ?");
		String name = sc.nextLine();
		
		System.out.println("What´s your favorite Stock?");
		String sticker = sc.nextLine();
		
		System.out.println("Quantity: ");
		int qtd = sc.nextInt();
		
		s = new _11_exercicio(sticker, qtd, name);
		
		System.out.println(s);
				
		sc.close();
	}

}
