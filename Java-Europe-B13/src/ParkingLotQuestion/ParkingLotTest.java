package ParkingLotQuestion;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLotTest {

	public static void main(String[] args) {
		
	  Level level= new Level(3, 10);
	  
	  Vehicle vehicle= new Car();
	  
	  System.out.println(level.findAvailableSpots(vehicle));
	  
	  level.spotFreed();
	  
	}		

}
