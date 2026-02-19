package in.scalive.entity.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.scalive.entity.Product;
import in.scalive.repository.ProductRepository;
import in.scalive.service.ProductService;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	private ProductService serv;

	@Autowired
	public MyCommandLineRunner(ProductService serv) {
		this.serv = serv;
	}

	@Override
	public void run(String... args) throws Exception {

//		Product p1 = new Product();
//		p1.setPid(101);
//		p1.setPname("Laptop");
//		p1.setPrice(50000.0);
//
//		Product p2 = new Product();
//		p2.setPid(102);
//		p2.setPname("Phone");
//		p2.setPrice(25000.0);
//		
//		serv.save(p1);
//		serv.save(p2);
		
		Product searchProduct = serv.findProductById(103);
		
		if(searchProduct != null) {
			System.out.println("id : "+searchProduct.getPid());
			System.out.println("name : "+searchProduct.getPname());
			System.out.println("price : "+searchProduct.getPrice());
		}
		

	}

}
