package cursoJava2019.exercises.ex00.entities;

public class Product {
	
	private String name;
	private Double price;
	private int quantity;

	public Product() {
		
	}
		
	public Product(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

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
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void addProducts(Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(Integer quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

}
