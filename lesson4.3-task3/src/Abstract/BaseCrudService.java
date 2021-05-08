package Abstract;

import java.util.ArrayList;
import java.util.List;

public interface BaseCrudService<T> {
	
	void add(T entity);
	void add(List<T> entities);
	void delete(T entity);
	void update(T entity);
	ArrayList<T> getAll();
	
}
