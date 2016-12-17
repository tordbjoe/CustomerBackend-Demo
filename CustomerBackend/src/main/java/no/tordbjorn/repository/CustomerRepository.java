package no.tordbjorn.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import no.tordbjorn.model.Customer;

@RepositoryRestResource(path="customer")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>{

}
