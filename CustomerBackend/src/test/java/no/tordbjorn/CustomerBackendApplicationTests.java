package no.tordbjorn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import no.tordbjorn.repository.CustomerCategoryRepository;
import no.tordbjorn.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerBackendApplicationTests {

	@Autowired
	private CustomerCategoryRepository customerCategoryRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testCustomerCategoryRepositoryHas2Entities() {
		assertEquals(2, customerCategoryRepository.count());
	}

	@Test
	public void testCustomerRepositoryHas4Entities() {
		assertEquals(4, customerRepository.count());
	}
	
}
