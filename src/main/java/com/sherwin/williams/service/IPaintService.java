package com.sherwin.williams.service;

public interface IPaintService {

	double amountOfPaintNeeded(double roomHeight, double roomLength, double roomWidth, int numberOfDoors,
			int numberOfWindows);

}
