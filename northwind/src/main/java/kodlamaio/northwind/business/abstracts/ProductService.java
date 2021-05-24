package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.concretes.DataResult;
import kodlamaio.northwind.core.utilities.result.concretes.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getById(int id);
	Result add(Product product);
	Result update(Product product);
	Result delete(Product product);

}
