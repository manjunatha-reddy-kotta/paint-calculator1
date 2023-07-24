package com.sherwin.williams.service;

import org.springframework.stereotype.Service;

import com.sherwin.williams.util.*;

@Service
public class PaintService implements IPaintService {

	

	@Override
	public double amountOfPaintNeeded(double roomHeight, double roomLength, double roomWidth, int numberOfDoors,
			int numberOfWindows) {
		System.out.println("in service class");
		return CalculationUtil.totalArea(roomHeight,roomLength,roomWidth,numberOfDoors,numberOfWindows);
	}

}
