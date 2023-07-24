package com.sherwin.williams.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sherwin.williams.service.IPaintService;

@RestController
@RequestMapping(value="/paint-caulcaulator")
public class PaintCalculatorController {

	@Autowired
	private IPaintService paintService;
	@GetMapping(value = "/paintNeeded")
	public ResponseEntity<String> amountOfPaintRequired(@RequestParam(value = "roomHeight") double roomHeight,@RequestParam(value = "roomLength") double roomLength,
			@RequestParam(value = "roomWidth") double roomWidth,@RequestParam(value = "numberOfDoors") int numberOfDoors,
			@RequestParam(value = "numberOfWindows") int numberOfWindows) {
		System.out.println("in controller class");
		double amountOfPaintNeeded =paintService.amountOfPaintNeeded(roomHeight,roomLength,roomWidth,numberOfDoors,numberOfWindows);
		
		 return ResponseEntity.status(HttpStatus.OK)
			        .body( amountOfPaintNeeded + " amount of paint needed to cover room’s interior paintable surfaces "  );
	
	}
}
