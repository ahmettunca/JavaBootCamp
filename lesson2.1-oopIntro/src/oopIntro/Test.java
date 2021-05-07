package oopIntro;

public class Test {

	public static void main(String[] args) {
		Product product1=new Product(1,"Lenovo V15", 3000,
						"Intel Core i3 2GB RAM", 10);
		Product product2=new Product(2,"Lenovo Ideapad", 4500,
				"Intel Core i5 4 GB RAM", 11);
		Product product3=new Product(3,"Monster AbraV13.1", 6000,
				"Intel Core i5 8GB RAM", 12);
		Product product4=new Product(4,"Lenovo V14", 7500,
				"Intel Core i7 16GB RAM", 15);
		
		Product[] products = {product1,product2,product3,product4};
		
		Category category = new Category(1, "Computer");
		
		ProductManager productManager = new ProductManager();
		productManager.addProduct(products);
		
	}
}
