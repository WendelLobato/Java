
public class Expressao_condicional_ternaria {

	public static void main(String[] args) {

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 /* verdadeiro */: preco * 0.05/*falso*/; 
		
		System.out.println(desconto);
		
		
		
	}

}
