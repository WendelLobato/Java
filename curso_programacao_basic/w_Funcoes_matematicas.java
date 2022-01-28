
public class w_Funcoes_matematicas {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x); // A recebe a raiz quadrada de "X"
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y); // Potenciação
		B = Math.pow(z, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + "Elevado a " + y + " = " + A);
		System.out.println(x + "Elevado ao quadrado = " + B);
		System.out.println("5 Elevado ao quadrado = " + C);
		
		A = Math.abs(y); // Valor absoluto, mesmo que negativo, ele será o valor positivo do mesmo número.
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
	}

}
