package bhanu.prakash.service;

import bhanu.prakash.model.Product;

public interface IproductService {

	public Integer saveproduct(Product id);
	public void updateproduct(Product id);
	public void deleteproduct(Integer id);
	public boolean existproduct(Integer id);
}
