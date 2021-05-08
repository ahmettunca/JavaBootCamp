package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.MySqlProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		//TODO: Spring IOC ile çözülecek
		ProductService productService = new ProductManager(new MySqlProductDao(),new JLoggerManagerAdapter());
		//Ürün vererek bu servisi çalýþtýrabilirim.
		Product product = new Product(1, 2,"Elma",12 , 50);
		productService.add(product);
	}
}
