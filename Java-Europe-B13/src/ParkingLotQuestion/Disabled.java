package ParkingLotQuestion;

public class Disabled extends Vehicle{
	 
	public Disabled(){
		
		 spotsNeeded = 1;
		 
	     size = VehicleSize.Disabled;
	 }

	 public boolean canFitInSpot(ParkingSpot spot) {

	     return spot.getSize()==VehicleSize.Disabled;

	 }
	 
	 public void print() {
			System.out.print("Disabled");
	}
}