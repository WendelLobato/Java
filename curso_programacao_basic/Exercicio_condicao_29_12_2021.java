import java.util.Scanner;

public class Exercicio_condicao_29_12_2021 {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		double nota1, nota2, total;
		
		System.out.println("Qual foi a nota do primeiro semestre ?");
		nota1 = valor.nextDouble();
		
		System.out.println("Qual foi a nota do segundo semestre ?");
		nota2 = valor.nextDouble();
		
		total = nota1 + nota2;
		
		if (total < 60) {
			System.out.println("Reprovado");
		}
		
		System.out.println("Nota final = " + total);
		valor.close();
	}

}
