package bhanu.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import bhanu.prakash.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
