package entities;

public class _09_Encapsulamento {

	private String name;
	private double price;
	private double quantity;
	
	public _09_Encapsulamento(String name, double price, double quantity) {//Contrutor
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
	}
	
	public _09_Encapsulamento() {
		
	}

	public _09_Encapsulamento(String name, double price) {//Contrutor
		this.name = name;
		this.price = price;

	}
	
	public double getprice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(double quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(double quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
