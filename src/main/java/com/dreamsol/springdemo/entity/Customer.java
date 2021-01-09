package com.dreamsol.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	@NotNull
	@Size(min=1, message = "name must not be empty")
	@Pattern(regexp = "^[a-zA-Z ]*$" ,message =  "must be letters and spaces")
	private String name;

	@Column(name = "mo_number")
	@NotNull
	@Pattern(regexp = "(^[6789]\\d{9}$)", message = "must start with 6,7,8,9 and length = 10")
	private String mo_number;

	@Column(name = "email")
	@Email(message = "must be valid mail")
	@NotNull
	@Size(min=1, message = "Email must not be empty")
	private String email;

	@Column(name = "age")
	@NotNull
	@Size(min=1, message = "Age is required")
	private String age;

	public Customer() {

	}

	public Customer(int id, String name, String mo_number, String email, String age) {
		this.id = id;
		this.name = name;
		this.mo_number = mo_number;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMo_number() {
		return mo_number;
	}

	public void setMo_number(String mo_number) {
		this.mo_number = mo_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mo_number=" + mo_number + ", email=" + email + ", age="
				+ age + "]";
	}

}
