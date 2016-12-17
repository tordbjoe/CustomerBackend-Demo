package no.tordbjorn.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import no.tordbjorn.model.CustomerCategory;

@Repository
public interface CustomerCategoryRepository extends PagingAndSortingRepository<CustomerCategory, Long>{

}
