package in.scalive.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.scalive.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
@Transactional
public class ProductRepository {

	private EntityManager entityManager;

	@Autowired
	public ProductRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Student> showAllUsers() {
		Query qry = entityManager.createNativeQuery("select * from Students", Student.class);
		return qry.getResultList();
	}
	
	public Student findByName(String name) {
		Student s = null;
		Query qry = entityManager.createNativeQuery("Select * from Students where name = ?", Student.class);
		qry.setParameter(1, name);
		
		try {
			s = (Student)qry.getSingleResult();
		}catch(Exception ex) {
			System.out.println("Error : "+ ex);
		}
		finally {
			return s;
		}
	}
	
	
	

}
