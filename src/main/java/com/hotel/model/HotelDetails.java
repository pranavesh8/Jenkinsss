package com.hotel.model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class HotelDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String hotelName;
	private String address;
	private long mobileNumber;
	private String status;
	
    @OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<VisitorsDetails> visitorsdetails;

	@OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<RoomDetails> roomdetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
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
