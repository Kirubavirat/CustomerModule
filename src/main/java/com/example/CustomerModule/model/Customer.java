package com.example.CustomerModule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
 @Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerId")
	private Integer customerId;
	@NotNull(message="first name should't be null")
	@Column(name = "firstName")
	private String firstName;
	@NotNull(message="last name should't be null")
	@Column(name = "lastName")
	private String lastName;
	@NotNull(message="Email id should't be null")
	@Column(name = "emailId")
	private String emailId;
	@NotNull(message="phone number should't be null")
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@NotNull(message="Address should't be null")
	@Column(name = "address")
	private String address;

}
