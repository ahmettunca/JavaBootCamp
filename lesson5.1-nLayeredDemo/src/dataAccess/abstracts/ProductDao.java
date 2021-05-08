package nLayeredDemo.dataAccess.abstracts;


import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	//�r�n ekleme,listeleme,g�ncelleme
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	//�r�n d�nd�r
	Product getProduct(int id);
	//�r�n listeleme
	List<Product> getAll();
}
