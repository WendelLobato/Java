package application;

import java.util.Scanner;

import entities._10_banco;

public class _10_cadastro_banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		_10_banco banco;
		
		System.out.println("Enter personal data: ");
		System.out.println("Enter account number: ");
		int nConta = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		System.out.println("Is there an initial deposit (y/n) ?");
		char opcao = sc.next().charAt(0);
		if (opcao == 'y') {
			System.out.println("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			banco = new _10_banco(nConta, name, depositoInicial);
			
		} else {
			banco = new _10_banco(nConta,name);
		}
		
		
		System.out.println();
		System.out.println("Account data: " + banco);
		
		System.out.println("Enter a deposity value: ");
		double deposit = sc.nextDouble();
		banco.setvDepositado(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(banco);
		
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		banco.setvRetirado(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(banco);


		
		
		
		sc.close();
	}

}
