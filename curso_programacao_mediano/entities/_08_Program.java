package entities;

public class _08_Program {

	public String name;
	public double price;
	public double quantity;
	
	public _08_Program(String name, double price, double quantity2) {//Contrutor
		this.name = name;
		this.price = price;
		this.quantity = quantity2; 
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
