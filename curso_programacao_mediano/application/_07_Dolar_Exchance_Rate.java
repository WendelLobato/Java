package application;

import java.util.Scanner;

import entities._07_Dolar;

public class _07_Dolar_Exchance_Rate {

	public static void main(String[] args) {

		Scanner $ = new Scanner(System.in);
		System.out.println("What is the dollar price ?");
		_07_Dolar.dolar = $.nextDouble();

		System.out.println("How many dollars will be bought ?");
		_07_Dolar.vdolar = $.nextDouble();

		System.out.println("Amount to be paid in reais = R$ " + _07_Dolar.Reais());

		$.close();
	}

}
