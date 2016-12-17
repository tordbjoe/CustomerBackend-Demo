package no.tordbjorn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Customer {

	public Customer() {

	}

	public Customer(String firstName, String lastName, String emailAdress, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAdress = emailAdress;
		this.dateOfBirth = dateOfBirth;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Size(min=2,max=100)
	private String firstName;
	
	@Size(min=2,max=100)
	private String lastName;

	@Email
	@NotNull
	private String emailAdress;

	@NotNull
	private Date dateOfBirth;

	@ManyToOne
	@JoinColumn(name = "customer_category_id")
	private CustomerCategory customerCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public CustomerCategory getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(CustomerCategory customerCategory) {
		this.customerCategory = customerCategory;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

}
