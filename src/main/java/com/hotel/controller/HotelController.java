package com.hotel.controller;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.domain.HotelDomine;
import com.hotel.model.BookingDetails;
import com.hotel.seviceImpl.HotelSericeImpl;

@RestController
//@RequestMapping("/url")
public class HotelController {
	
	@Autowired
	private HotelSericeImpl hetelserviceimpl;
	
	@RequestMapping("/home")
	public String method(){
		return "index";
	}
	
	@RequestMapping("/signup")
	public String methods(){
		return "signup";
	}
	
	@PutMapping("/admin/updateHotelldetails")
	public HotelDomine updateEmployee(@RequestBody HotelDomine obj) {
	return hetelserviceimpl.updateHoteldetails(obj);
	}	
	
	@PostMapping("/post")
	public HotelDomine save(@ModelAttribute HotelDomine obj) {
	return hetelserviceimpl.saveHospital(obj);
	}
	
	@GetMapping("/getbyid/{id}")
	public HotelDomine fatchById(@PathVariable int id) {
	return hetelserviceimpl.getHotelDomineById(id);
	}
	@GetMapping("/getallids")
	public List<HotelDomine> fetchAll() {
	return hetelserviceimpl.getAll();
	}
	@GetMapping("/getbyname/{name}")
	public HotelDomine fatchHotelByName(@PathVariable String name) {
	return hetelserviceimpl.getHotelDomineByName(name);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
	return hetelserviceimpl.deleteHotellById(id);
	}
	}
