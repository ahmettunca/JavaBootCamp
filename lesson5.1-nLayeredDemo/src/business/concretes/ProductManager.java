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
	//Artýk tek bir dao'yabaðlý deðiliz. Ýstediðimiz veritabaný ile çalýþabiliriz sistem bozulmaz
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		this.productDao=productDao;
		this.loggerService=loggerService;
	}
	
	@Override
	public void add(Product product) {
		// iþ kodlarýný (kurallarý) yazýlýr.
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
			return; //boþ return metodu bitirir.
		}
		//DI implementasyonu ile baðýmlýlýðý ortadan kaldýrdýk
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi"+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
