package Abstract;

import java.util.ArrayList;
import java.util.List;

import Entities.Product;

public abstract class BaseProductManager implements ProductService {
	
	@Override
	public void add(Product entity) {
		System.out.println("Product: "+entity.getName()+" added.");
		
	}

	@Override
	public void add(List<Product> entities) {
		for(Product c:entities) {
			this.add(c);
		}
		
	}

	@Override
	public void delete(Product entity) {
		System.out.println("Product: "+entity.getName()+" deleted.");
		
	}

	@Override
	public void update(Product entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
