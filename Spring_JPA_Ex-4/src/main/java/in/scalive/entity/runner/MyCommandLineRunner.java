package in.scalive.entity.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.scalive.entity.Student;
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

		Student s = serv.getByname("Phoolsagar");
		
		if(s != null) {
			System.out.println("Name : "+ s.getName() + " Roll "+s.getRoll()+ " Per "+ s.getPer());
		}else {
			System.out.println("Record not found!");
		}
		
		}
		

	}


