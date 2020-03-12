package ParkingLotQuestion;

public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int spotNumber;
	private Level level;
	private boolean isDisabled;
	
	public ParkingSpot(Level level,int spotNumber, VehicleSize vehicleSize,boolean isDisabled) {
	
		this.level= level;
		this.spotNumber=spotNumber;
		this.spotSize= vehicleSize;
		this.isDisabled=isDisabled;
		
	}
	public boolean getDisabled() {
		return isDisabled;
	}
	
	public boolean isAvailable() {
		return vehicle==null;
	}
	
	public boolean canFitVehicle(Vehicle vehicle) {
		return isAvailable()&&vehicle.canFitInSpot(this);
	}

	public boolean park(Vehicle vehicle) {
		
		if (!(canFitVehicle(vehicle))){
			return false;	
		}	
		this.vehicle=vehicle;
		
		vehicle.parkInSpot(this);
		
		return true;
	}
	
	public int getSpotNumber() {
		return spotNumber;	
	}
	
	public VehicleSize getSize() {
		return spotSize;
	}
	public void removeVehicle() {
		level.spotFreed();
		vehicle= null;
		
	}
}
