package in.scalive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.scalive.entity.Product;
import in.scalive.repository.ProductRepository;



@Service
public class ProductService {
	private ProductRepository repo;

	@Autowired
	public ProductService(ProductRepository repo) {
		this.repo = repo;
	}
	
	public void showAllStudents() {
		repo.showAllUsers();
	}
	

}
