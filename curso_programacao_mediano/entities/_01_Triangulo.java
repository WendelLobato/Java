package entities;

public class _01_Triangulo {

	public double weight;
	public double height;
	public double diagonal;
	public double perimeter;
	
	public double area() {
		return (weight * height);
	}
	
	public double diagonal() {
		return diagonal = Math.sqrt((weight * weight)+(height * height));
	}
	
	public double perimeter() {
		return perimeter = (weight + height) *2;
		
	}
}
