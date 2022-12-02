package com.hotel.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class RoomDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String roomNumber;
	private String roomCost;
	private String roomType;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
	private HotelDetails hotel;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(String roomCost) {
		this.roomCost = roomCost;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public HotelDetails getHotel() {
		return hotel;
	}

	public void setHotel(HotelDetails hotel) {
		this.hotel = hotel;
	}
	}