package ParkingLotQuestion;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLotTest {

	public static void main(String[] args) {
		
	  Level level= new Level(1, 100);
	  
	  ParkingLot parkingLot = new ParkingLot();
	  
	  Vehicle vehicle= new Disabled();
	  
	  Vehicle vehicle1= new Bus();
	  
	  Vehicle vehicle2= new Car();
	  
	  System.out.println(level.parkVehicle(vehicle1));
	  
	  System.out.println(level.parkVehicle(vehicle));
	  
	  System.out.println(level.parkVehicle(vehicle2));
	  
	  level.spotFreed();
	  
	  Level level2= new Level(2, 100);
	  level2.spotFreed(); 
	  
	  Level level3= new Level(3, 100);
	  level3.spotFreed(); 
	}		

}
