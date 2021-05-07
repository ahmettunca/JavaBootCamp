package business;

import java.util.ArrayList;
import java.util.List;

import entity.Category;
import fixed.Message;

public class CategoryManager {

	List<Category> categories;
	
	public CategoryManager() {
		this.categories= new ArrayList<Category>();
		
		
	}
	
	public void add(Category category) {
		this.categories.add(category);
		System.out.println(category.getName()+" "+Message.added);
	}
	
	public void update(Category category) {
		int courseIndex = this.categories.indexOf(category);
		
		categories.set(courseIndex, category);
		System.out.println(category.getName()+" "+Message.updated);
	}
	
	public void delete(Category category) {
		int courseIndex = this.categories.indexOf(category);
		
		categories.remove(courseIndex);
		System.out.println(category.getName()+" "+Message.deleted);
	}
	
	public Category getById(long id) {
		return this.categories.stream().filter(category->category.getId() == id).findFirst().get();
	}

}
