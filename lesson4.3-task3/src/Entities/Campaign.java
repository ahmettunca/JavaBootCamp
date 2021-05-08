package Entities;

public class Campaign {

	private int id;
	private double discount;
	private String name;
	private Product product;
	
	
	public Campaign(int id, double discount, String name,Product product) {
		super();
		this.id = id;
		this.discount = discount;
		this.name = name;
		this.product=product;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
