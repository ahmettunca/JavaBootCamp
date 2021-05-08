package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService {

	//DI implementasyonu
	//Art�k tek bir dao'yaba�l� de�iliz. �stedi�imiz veritaban� ile �al��abiliriz sistem bozulmaz
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		this.productDao=productDao;
		this.loggerService=loggerService;
	}
	
	@Override
	public void add(Product product) {
		// i� kodlar�n� (kurallar�) yaz�l�r.
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor.");
			return; //bo� return metodu bitirir.
		}
		//DI implementasyonu ile ba��ml�l��� ortadan kald�rd�k
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi"+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
