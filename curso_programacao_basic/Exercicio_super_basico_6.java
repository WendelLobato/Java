import java.util.Scanner;

public class Exercicio_super_basico_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double at =  (A*C)/2;
		double ac = 3.14159 * (C*C);
		double atr = ((A+B) * C)/2;
		double aq = B * B;
		double ar = A * B;
		
		System.out.printf("TRIANGULO: %.2f %n CIRCULO: %.2f %n TRAPEZIO: %.2f %n QUADRADO: %.2f %n RETANGULO: %.2f",at,ac,atr,aq,ar);
		
		sc.close();
	}

}
