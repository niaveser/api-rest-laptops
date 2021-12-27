package com.example.springsesiones456;

import com.example.springsesiones456.entities.Laptop;
import com.example.springsesiones456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSesiones456Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringSesiones456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "MacBook Air M1", "Apple", 1028.00);
		Laptop laptop2 = new Laptop(null, "X1 Extreme Gen 4", "Lenovo", 2469.00);

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
