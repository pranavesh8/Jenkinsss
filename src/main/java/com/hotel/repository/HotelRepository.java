package com.hotel.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.model.HotelDetails;
public interface HotelRepository extends JpaRepository<HotelDetails, Integer>{

	HotelDetails findByHotelName(String name);
}
