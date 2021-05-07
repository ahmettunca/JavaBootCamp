package oopIntro;

public class ProductManager {

	public void addToCart(Product product) {
		System.out.println(product.getId()+" numaralý ürün:"+
							product.getName()+" sepete eklendi.");
	}
	
	public void addProduct(Product[] products) {
		for(Product product:products) {
			this.addToCart(product);
		}
	}
}
