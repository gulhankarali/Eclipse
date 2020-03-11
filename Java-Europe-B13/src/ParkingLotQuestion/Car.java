package ParkingLotQuestion;

public class Car extends Vehicle{
	
	public Car() {
       
			spotsNeeded = 1;
	        size = VehicleSize.Compact;
	        isDisabledCar= false;
	      
	}

	    
    public boolean canFitInSpot(ParkingSpot spot){
	        return spot.getSize() == VehicleSize.Compact&&spot.getDisabled()==false;
	        
	}
	 
    public void print() {
			System.out.print("Car");
	}

}
