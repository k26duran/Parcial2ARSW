package edu.eci.arsw.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.services.WeatherService;

@RestController
@RequestMapping(value="v1/weather")
public class WeatherController {
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getCar(){
    	try{
            return new ResponseEntity<>(WeatherService.list(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
}
