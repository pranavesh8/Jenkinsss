package com.hotel.domain;
import java.util.Locale;
public class BookingDomain{
	
	private int Id;
	private Locale check_in_Date;
	private Locale check_out_date;
	
    //private HotelDetails hotel;

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
	}