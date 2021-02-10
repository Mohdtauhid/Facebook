package com.test.UserApi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
    @Column
	private String name;
    @Column
	private String email;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user") 
	private MobileNumber mobileNumber;
  
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Address address;

	public User(int id, String name,String email,Address address) {
		
		this.id = id;
		this.name = name;
		this.email=email;
		this.address=address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MobileNumber getMobileNumber(String MobileNumber) {
		return getMobileNumber(null) ;
	}

	public void setMobileNumber(MobileNumber mobileNumber) {
		 this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		 this.address = address;
	}


}


