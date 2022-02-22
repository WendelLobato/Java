package application;

import java.util.Scanner;

import entities._14_aluguel;

public class _14_exercicio_vetor_aluguel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		_14_aluguel[] vect = new _14_aluguel[10];
		
		System.out.println("How many rooms will be rented ?");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new _14_aluguel(name,email);
		}
		System.out.println();
		System.out.println("busy rooms: ");
		for (int i = 1; i<n;i++ ) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
