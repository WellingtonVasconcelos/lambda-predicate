package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	//Método estático trabalha com o produto que você passa com argumento
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}
	
	//Método não estático é o método da estácia. Ele trabalha com o proprio objeto
	public boolean nonStaticProductPredicate() {
		return price >= 100.00;
	}
	
	@Override
	public String toString() {
		return  name + ", " +  String.format("%.2f",  price);
	}
}