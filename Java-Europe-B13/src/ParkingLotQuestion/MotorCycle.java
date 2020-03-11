package ParkingLotQuestion;

public class MotorCycle extends Vehicle{
    public MotorCycle(){
       
    	spotsNeeded = 1;
        size = VehicleSize.Motorcycle;

    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return (spot.getSize() == VehicleSize.Compact||spot.getSize() == VehicleSize.Motorcycle)&&(spot.getDisabled()==false);
    }
    
    public void print() {
		System.out.print("Motorcycle");
	}
}