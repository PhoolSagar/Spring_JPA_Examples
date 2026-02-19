package in.scalive.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.scalive.entity.Product;
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
	
	public void showAllUsers() {
		Query qry = entityManager.createNativeQuery("select * from Students");
		List<Object[]> studList = qry.getResultList();
		for(Object[] rec : studList) {
			System.out.println(rec[0] + "\t" + rec[1] + "\t" + rec[2]);
		}
	}
}
