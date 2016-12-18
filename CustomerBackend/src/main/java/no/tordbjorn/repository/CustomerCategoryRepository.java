package no.tordbjorn.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import no.tordbjorn.model.CustomerCategory;

@RepositoryRestResource(path="customercategory")
public interface CustomerCategoryRepository extends PagingAndSortingRepository<CustomerCategory, Long>{

}
