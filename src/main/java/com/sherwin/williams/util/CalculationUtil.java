package com.sherwin.williams.util;


public class CalculationUtil {
	
	public static double totalArea(double roomHeight, double roomLength, double roomWidth, int numberOfDoors,
			int numberOfWindows) 
	{
		 
	    double wallArea;
	    double perimeter = (roomLength * 2) + (roomWidth * 2);
	    		wallArea = perimeter *  roomHeight;
	    
	    int areaOfDoors = 20 *  numberOfDoors;
        int areaOfWindows = 15 *  numberOfWindows;
        
        double totalPaintArea = wallArea - areaOfDoors - areaOfWindows;
          double amountOfGallonsNeeded=totalPaintArea/PaintCalculatorConstants.Square_FtPer_Gallon;
          return amountOfGallonsNeeded;
	}

}
