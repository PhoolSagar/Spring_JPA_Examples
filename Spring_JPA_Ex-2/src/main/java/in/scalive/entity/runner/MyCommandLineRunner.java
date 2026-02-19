package in.scalive.entity.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

		serv.showAllStudents();
		}
		

	}


