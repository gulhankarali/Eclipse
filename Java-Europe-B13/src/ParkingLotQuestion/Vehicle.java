package ParkingLotQuestion;

import java.util.ArrayList;

public abstract class Vehicle {
	
	protected ArrayList<ParkingSpot> parkingSpots= new ArrayList<ParkingSpot>();
	
	protected String licencePlate;
	
	protected int spotsNeeded;
	
	protected VehicleSize size;
	
	
	
	public abstract boolean canFitInSpot(ParkingSpot spot);
	
	public int getSpotsNeeded(){
        return spotsNeeded;
    }
	
	
	public void parkInSpot(ParkingSpot s){
        parkingSpots	.add(s);
    }


	public VehicleSize getSize(){
	        return size;
	}
	
	public void clearSpots() {
		
		for (int i = 0; i < parkingSpots.size(); i++){
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();		
	}
	public abstract void print();  
}
