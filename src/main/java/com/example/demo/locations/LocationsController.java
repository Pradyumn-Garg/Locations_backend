package com.example.demo.locations;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class LocationsController {

	@Autowired
	private LocationsRepository locationsRepo;
	
	@GetMapping("/locations")
	public List <Locations> getAllinterns()
	{
		return locationsRepo.findAll();
	}
	
	@GetMapping("/locations/{id}")
	public Optional<Locations> getstudentsbyid(@PathVariable String id)
	{
		return locationsRepo.findById(id);
	}
	
	@PostMapping("/locations")
	public Locations saveLocations(@Valid @RequestBody Locations locations) {
		return locationsRepo.save(locations);
	}
	
	@PutMapping("/locations/{id}")
	public Locations updateStudent( @RequestBody Locations locations, @PathVariable String id)
	
	{
		Locations currentLocation;
		currentLocation = locationsRepo.findById(id).get();
		currentLocation.setCity(locations.getCity());
		currentLocation.setCountryid(locations.getCountryid());
		currentLocation.setPostalcode(locations.getPostalcode());
		currentLocation.setLocationid(locations.getLocationid());
		return locationsRepo.save(currentLocation);
		
	}
	
	@DeleteMapping("/locations/{id}")
	public void deletestudentsbyid(@PathVariable String id)
	{
		locationsRepo.deleteById(id);
	}
}
