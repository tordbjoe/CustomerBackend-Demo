package no.tordbjorn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.tordbjorn.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
