package nLayeredDemo.dataAccess.abstracts;


import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	//Ürün ekleme,listeleme,güncelleme
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	//ürün döndür
	Product getProduct(int id);
	//ürün listeleme
	List<Product> getAll();
}
