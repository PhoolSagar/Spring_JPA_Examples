package in.scalive.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.scalive.entity.Product;
import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class ProductRepository {

	private EntityManager entityManager;

	@Autowired
	public ProductRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void saveProduct(Product product) {
		entityManager.persist(product);
	}
	
	public Product findProductById(Integer id) {
		return entityManager.find(Product.class, id);
	}
}
