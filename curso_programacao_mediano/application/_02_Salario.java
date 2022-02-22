package application;

import java.util.Scanner;

import entities._02_funcionario;

public class _02_Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		_02_funcionario funcionario = new _02_funcionario();
		
		funcionario.name = sc.nextLine();
		funcionario.grossSalary = sc.nextDouble();
		funcionario.tax = sc.nextInt();
		
		System.out.println(funcionario);
		
		System.out.println("Write percentage of increase");
		double percentage = sc.nextDouble();
		funcionario.IncreaseSalary(percentage);
		
		System.out.println(funcionario);
		
		sc.close();
	}

}
