package org.pcomeziantou.comptavolley.comptavolleybackend;

import org.pcomeziantou.comptavolley.comptavolleybackend.entities.Customer;
import org.pcomeziantou.comptavolley.comptavolleybackend.entities.UserCompta;
import org.pcomeziantou.comptavolley.comptavolleybackend.repositories.CustomerRepository;
import org.pcomeziantou.comptavolley.comptavolleybackend.repositories.UserComptaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ComptavolleybackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComptavolleybackendApplication.class, args);
	}


	@Bean
    //CommandLineRunner commandLineRunner(CustomerRepository customerRepository
	CommandLineRunner start(CustomerRepository customerRepository
	 						, UserComptaRepository userComptaRepository
	){
    	return args -> {
			Customer customer = new Customer();
			customer.setName("Test");
			customerRepository.save(customer);

			UserCompta userCompta = new UserCompta();
			userCompta.setName("Test");
			userCompta.setEmail("test.test@test.com");
			userCompta.setRole("ADMIN");

			UserCompta userCompta2 = new UserCompta();
			userCompta2.setName("Test");
			userCompta2.setEmail("test.test@test.com");
			userCompta2.setRole("ADMIN");

			userComptaRepository.save(userCompta);
			userComptaRepository.save(userCompta2);

			customer.getUsers().add(userCompta);
			customer.getUsers().add(userCompta2);

			customerRepository.save(customer);	

	};

	}

}
