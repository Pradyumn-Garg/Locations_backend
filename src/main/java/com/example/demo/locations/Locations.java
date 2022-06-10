package com.example.demo.locations;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Locations {
	
	@Id
	public String _id;
	
	private String city;
	private String countryid;
	private String postalcode;
	private int locationid;
	

 
}
