import java.util.Scanner;

public class Exercicio_28_12_Basico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String time, amor, money, estudo,nenem;
		int ano, titulo, brasileiro, mundial;
		
		time = "Flamengo";
		amor = "Camila";
		money = "Independência Financeira";
		estudo = "Estudos";
		
		
		ano = 2022;
		titulo = 2019;
		brasileiro = 2020;
		mundial = 1981;
		
		System.out.println("*****Projeto para 2022*****");
		System.out.printf("O ano de %d será um excelente ano, no qual há muitas meta para superar %d. %n", ano,brasileiro);
		System.out.printf("Entre elas, curtir mais juntinho com a %s, torcer bastante para o %s, progedir nos %s para futuramente ter %s.%n ", amor, time, estudo, money);
		System.out.printf("Ter a sorte do %s consquistar o título de %d e repetir o ano de %d %n%n", time, mundial, titulo);

		System.out.println("Digite o nome do seu neném: " );
		nenem = sc.nextLine();
		
		System.out.println("\nMeu nenemzão é a: " + nenem);
		sc.close();
		
	}

}
