package ParkingLotQuestion;

public class Level {
	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots=0;
	private static final int SPOT_PER_ROW=10;
	
	public Level(int floor, int numberOfSpots) {
		this.floor=floor;
		this.availableSpots=numberOfSpots;
		
		spots = new ParkingSpot[numberOfSpots];
		
		int largeSpots = numberOfSpots/4;
		int motorbikeSpots = numberOfSpots/4;
		int compactSpots = numberOfSpots - largeSpots- motorbikeSpots;
		
		for (int i = 0; i < numberOfSpots; i++){
            VehicleSize size = VehicleSize.Motorcycle;
            System.out.println("motorcycle");
            if (i < largeSpots){
                size = VehicleSize.Large;
                System.out.println("bus");
            } else if (i< largeSpots+compactSpots){
            	 System.out.println("car");
            	size= VehicleSize.Compact;
            }
            
            int row = i / SPOT_PER_ROW;
            
           	spots[i] = new ParkingSpot(this, row, i, size);
        }
	}
	
	public int availableSpots() {
		return availableSpots;
	}
	
	public boolean parkStartingAtSpot(int number, Vehicle vehicle){
       
        vehicle.clearSpots();
        boolean success = true;
        for (int i = number; i < number + vehicle.spotsNeeded; i++){
            success &= spots[i].park(vehicle);
        }
        availableSpots -= vehicle.spotsNeeded;
        return success;
    }
	
	public int findAvailableSpots(Vehicle vehicle){
      
		int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;

        for (int i = 0; i < spots.length; i++){
    	
        	ParkingSpot spot = spots[i];
    			
    			if (lastRow != spot.getRow()){
    				spotsFound = 0;
    				
    				lastRow = spot.getRow();
    			}
    			if (spot.canFitVehicle(vehicle)){
    				spotsFound++;
    			}
    			else{
    				spotsFound = 0;
    			}
    			if (spotsFound == spotsNeeded){
    				return i - (spotsNeeded - 1);
    			}
    		}
        return -1;
    }

	
	public boolean parkVehicle(Vehicle vehicle){
       
        if (availableSpots() < vehicle.getSpotsNeeded())
            return false;

        int spotNumber = findAvailableSpots(vehicle);
        
        if (spotNumber < 0)
            return false;
        System.out.print(",Spot Number " + spotNumber);
        
        return parkStartingAtSpot(spotNumber, vehicle);
    }
	
	public void spotFreed(){
        availableSpots++;
        System.out.println("Available Spots in the current level :" + availableSpots);
    }
}
