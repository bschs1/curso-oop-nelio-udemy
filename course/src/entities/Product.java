package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public String totalValueInStock() {
		 double retorninho = quantity * price;
		 return String.format("%.2f", retorninho);
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; // o this é uma auto referencia para o objeto, o this.quantity estou deixando explicito que quero acessar o ATRIBUTO DA CLASSE e NÃO O PARAMETRO
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		// this.quantity = o da classe, e o quantity = o do parametro
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + totalValueInStock();
	}
}
