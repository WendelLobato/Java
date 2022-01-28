import java.util.Scanner;

public class Exercicio_basico {

	public static void main(String[] args) {

		Scanner novo = new Scanner(System.in);

		double largura, comprimento, valor, area, preco;

		System.out.println("Escreva a largura do terreno: ");
		largura = novo.nextDouble();

		System.out.println("Escreva o comprimento do terreno: ");
		comprimento = novo.nextDouble();

		System.out.println("Escreva o valor do terreno: ");
		valor = novo.nextDouble();

		area = comprimento * largura;
		preco = valor * area;

		System.out.println("Area = " + area);
		System.out.println("Preco = " + preco);
		novo.close();
	}

}
