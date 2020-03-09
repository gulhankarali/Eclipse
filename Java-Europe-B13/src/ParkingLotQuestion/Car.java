package ParkingLotQuestion;

public class Car extends Vehicle{
	public Car() {
	       
			spotsNeeded = 1;
	        size = VehicleSize.Compact;
	      
	    }

	    public boolean canFitInSpot(ParkingSpot spot){
	        return spot.getSize() == VehicleSize.Compact;
	    }
	    public void print() {
			System.out.print("Car");
		}

}
