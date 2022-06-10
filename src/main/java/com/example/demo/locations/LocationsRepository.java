package com.example.demo.locations;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationsRepository extends MongoRepository <Locations, String>{

}
