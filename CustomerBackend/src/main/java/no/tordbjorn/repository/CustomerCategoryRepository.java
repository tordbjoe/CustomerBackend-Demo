package no.tordbjorn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.tordbjorn.model.CustomerCategory;

@Repository
public interface CustomerCategoryRepository extends JpaRepository<CustomerCategory, Long>{

}
