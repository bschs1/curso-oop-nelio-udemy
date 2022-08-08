package entities;

public class Product {

	// Variaveis
	private String name;
	private double price;
	private int quantity;

	// Constructors
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		// super(); // se a classe product for sub-classe de algo importante no constructor, ele vai
					// chamar o construtor da super classe, n esse!
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Quantity precisa ser private pq só podemos alterar a quantidade com entrada e
	// saida do estoque (regra de negocio)

	public int getQuantity() {
		return quantity;
	}

	// Methods

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}