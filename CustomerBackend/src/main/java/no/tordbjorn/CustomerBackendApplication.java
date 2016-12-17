package no.tordbjorn;

import java.util.Date;
import java.util.HashSet;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import no.tordbjorn.model.Customer;
import no.tordbjorn.model.CustomerCategory;
import no.tordbjorn.repository.CustomerCategoryRepository;

@SpringBootApplication(scanBasePackages="no.tordbjorn")
public class CustomerBackendApplication implements CommandLineRunner {

	@Autowired
	private CustomerCategoryRepository customerCategoryRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerBackendApplication.class, args);
	}

	
	@Override
	@Transactional
	public void run(String... arguments) throws Exception {
		
		final CustomerCategory regularCategory = new CustomerCategory("Regular", false);
		@SuppressWarnings({ "serial", "deprecation" })
		HashSet<Customer> regularCustomers = new HashSet<Customer>() {{
			add(new Customer("Joe", "Regular", "joe@regular.com", new Date(1980, 7, 5)));
			add(new Customer("Jane", "Regular", "joe@regular.com", new Date(1982, 4, 12)));
		}};
		regularCategory.setCustomers(regularCustomers);
		
		final CustomerCategory vipCategory = new CustomerCategory("Very Important Customer", true);
		@SuppressWarnings({ "serial", "deprecation" })
		HashSet<Customer> vipCustomers = new HashSet<Customer>() {{
			add(new Customer("Joe", "Rich", "joe@vip.com", new Date(1977, 2, 15)));
			add(new Customer("Jane", "Rich", "joe@vip.com", new Date(1979, 1, 20)));
		}};
		vipCategory.setCustomers(vipCustomers);
		
		
		customerCategoryRepository.save(new HashSet<CustomerCategory>() {{
			add(regularCategory);
			add(vipCategory);
		}});
	}
	
	
}
