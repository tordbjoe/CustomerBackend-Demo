package no.tordbjorn;

import java.time.LocalDate;
import java.time.Month;
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
		
		final CustomerCategory regularCategory = new CustomerCategory("Regular Customer", false);
		
		HashSet<Customer> regularCustomers = new HashSet<Customer>() {{
			add(new Customer("Joe", "Regular", "joe@regular.com", LocalDate.of(1977, Month.FEBRUARY, 12)));
			add(new Customer("Jane", "Regular", "joe@regular.com", LocalDate.of(1980, Month.MARCH, 20)));
		}};
		regularCategory.setCustomers(regularCustomers);
		
		final CustomerCategory vipCategory = new CustomerCategory("Very Important Customer", true);
		
		HashSet<Customer> vipCustomers = new HashSet<Customer>() {{
			add(new Customer("Joe", "Rich", "joe@vip.com", LocalDate.of(1977, Month.FEBRUARY, 15)));
			add(new Customer("Jane", "Rich", "joe@vip.com", LocalDate.of(1982, Month.JANUARY, 12)));
		}};
		vipCategory.setCustomers(vipCustomers);
		
		
		customerCategoryRepository.save(new HashSet<CustomerCategory>() {{
			add(regularCategory);
			add(vipCategory);
		}});
	}
	
	
}
