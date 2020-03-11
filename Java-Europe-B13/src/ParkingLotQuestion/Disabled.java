package ParkingLotQuestion;

public class Disabled extends Vehicle{
	 
	public Disabled(){
		
		 spotsNeeded = 1;
		 
	     size = VehicleSize.Compact;
	     isDisabledCar= true;
	 }

	 public boolean canFitInSpot(ParkingSpot spot) {

	     return spot.getSize()==VehicleSize.Compact&&spot.getDisabled()==true;

	 }
	 
	 public void print() {
			System.out.print("Disabled");
	}
}