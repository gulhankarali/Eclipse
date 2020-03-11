package ParkingLotQuestion;

public class Level {
	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots=0;
	
	public Level(int floor, int numberOfSpots) {
		this.floor=floor;
		this.availableSpots=numberOfSpots;
		
		spots = new ParkingSpot[numberOfSpots];
		
		int disabled=10;
		int largeSpots = numberOfSpots/10;
		int motorbikeSpots = numberOfSpots/40;
		int compactSpots = numberOfSpots - largeSpots- motorbikeSpots-10;
		
		for (int i = 0; i < numberOfSpots-disabled; i++){
            VehicleSize size = VehicleSize.Motorcycle;

            if (i < largeSpots){
                size = VehicleSize.Large;
         
            } else if (i< largeSpots+compactSpots){

            	size= VehicleSize.Compact;
            }
          
            
           	spots[i] = new ParkingSpot(this, i, size, false);
        }
		for (int i=numberOfSpots-10; i<numberOfSpots; i++) {
	
			spots[i] = new ParkingSpot(this, i, VehicleSize.Compact, true);
			
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
        int spotsFound = 0;

        for (int i = 0; i < spots.length; i++){
    	
        	ParkingSpot spot = spots[i];
    			

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
        System.out.print("Spot Number " +spotNumber+" ");
        
        vehicle.print();
        
        return parkStartingAtSpot(spotNumber, vehicle);
      
    }
	
	public void spotFreed(){
        availableSpots++;
        System.out.println("Available Spots in the "+ floor+" level : " + availableSpots);
    }
}
