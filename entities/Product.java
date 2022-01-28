package entities;

public class Product {
	
	public String name;
	
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {//To String serve para a fun��o permitir que haja print das informa��es, buscando o objeto.
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
