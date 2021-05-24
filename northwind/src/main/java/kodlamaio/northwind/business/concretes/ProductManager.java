package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.concretes.DataResult;
import kodlamaio.northwind.core.utilities.result.concretes.Result;
import kodlamaio.northwind.core.utilities.result.concretes.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.concretes.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}

	@Override 
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Ürünler Listelendi "); 
	}

	@Override
	public DataResult<List<Product>> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Product product) {
		
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

	@Override
	public Result update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
