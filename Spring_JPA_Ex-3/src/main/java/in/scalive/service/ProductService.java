package in.scalive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.scalive.entity.Student;
import in.scalive.repository.ProductRepository;



@Service
public class ProductService {
	private ProductRepository repo;

	@Autowired
	public ProductService(ProductRepository repo) {
		this.repo = repo;
	}
	
	public List<Student> showAllStudents() {
		return repo.showAllUsers();
	}
	

}
