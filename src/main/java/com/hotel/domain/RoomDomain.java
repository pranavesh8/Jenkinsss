package com.hotel.domain;
public class RoomDomain {
    private int Id;
	private String roomNumber;
	private String roomCost;
	private String roomType;
	//private HotelDetails hotel;

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
    }