package entities;

public class _05_Calculator {
	
	public  final double PI = 3.14159;
	
	public  double circunference(double radius) {
		return 2 * PI * radius;
	}

	public  double volume(double radius) {
		return (4 * PI * radius * radius * radius) / 3;
	}

}
