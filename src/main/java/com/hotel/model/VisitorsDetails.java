package com.hotel.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class VisitorsDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String address;
    private String emailId;
	private long mobileNumber;
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    @JsonBackReference
	private HotelDetails hotel;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public HotelDetails getHotel() {
		return hotel;
	}

	public void setHotel(HotelDetails hotel) {
		this.hotel = hotel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	}