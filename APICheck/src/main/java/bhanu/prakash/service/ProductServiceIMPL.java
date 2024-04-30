package bhanu.prakash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bhanu.prakash.model.Product;
import bhanu.prakash.repo.ProductRepository;

@Service
public class ProductServiceIMPL implements IproductService{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public Integer saveproduct(Product id) {
		// TODO Auto-generated method stub
		return repo.save(id).getProId();
	}

	@Override
	public void updateproduct(Product id) {
		// TODO Auto-generated method stub
		repo.save(id);
	}

	@Override
	public void deleteproduct(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public boolean existproduct(Integer id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

}
