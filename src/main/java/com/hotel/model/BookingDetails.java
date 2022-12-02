package com.hotel.model;
import java.util.Locale;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Locale check_in_Date;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Locale check_out_date;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    @JsonBackReference

	private HotelDetails hotel;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Locale getCheck_in_Date() {
		return check_in_Date;
	}

	public void setCheck_in_Date(Locale check_in_Date) {
		this.check_in_Date = check_in_Date;
	}

	public Locale getCheck_out_date() {
		return check_out_date;
	}

	public void setCheck_out_date(Locale check_out_date) {
		this.check_out_date = check_out_date;
	}

	public HotelDetails getHotel() {
		return hotel;
	}

	public void setHotel(HotelDetails hotel) {
		this.hotel = hotel;
	}
	}