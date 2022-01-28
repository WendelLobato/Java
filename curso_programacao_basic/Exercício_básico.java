import java.util.Locale;

public class Exercício_básico {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.printf("Measue with eight decimal plances: %f %n", measure);
		System.out.printf("Rouded: %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.println("US decimal point: " + measure);
		
	}

}
