package com.hotel.domain;
import java.util.List;
import com.hotel.model.BookingDetails;
import com.hotel.model.RoomDetails;
import com.hotel.model.VisitorsDetails;

public class HotelDomine {
	
	private int Id;
	private String hotelName;
	private String address;
	private long mobileNumber;
	private String status;
	
   private List<VisitorsDetails> visitorsdetails;

   private List<RoomDetails> roomdetails;
	
   private List<BookingDetails> bookingdetails;

    public int getId() {
		return Id;
	}

    public void setId(int id) {
		Id = id;
	}

    public String getHotelName() {
		return hotelName;
	}

    public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

    public String getAddress() {
		return address;
	}

    public void setAddress(String address) {
		this.address = address;
	}

    public long getMobileNumber() {
		return mobileNumber;
	}

    public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

    public String getStatus() {
		return status;
	}

    public void setStatus(String status) {
		this.status = status;
	}

    public List<VisitorsDetails> getVisitorsdetails() {
		return visitorsdetails;
	}

    public void setVisitorsdetails(List<VisitorsDetails> visitorsdetails) {
		this.visitorsdetails = visitorsdetails;
	}

    public List<RoomDetails> getRoomdetails() {
		return roomdetails;
	}

    public void setRoomdetails(List<RoomDetails> roomdetails) {
		this.roomdetails = roomdetails;
	}

    public List<BookingDetails> getBookingdetails() {
		return bookingdetails;
	}

    public void setBookingdetails(List<BookingDetails> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}
    }
