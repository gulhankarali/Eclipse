package day16_classObjects;

public class CellPhoneObjects {

	public static void main(String[] args) {
	
		CellPhone cellPhone1 = new CellPhone();
		
		cellPhone1.brand = "Apple";
		
		cellPhone1.colour= "Black";
		
		cellPhone1.screenSize= 6;
		
		cellPhone1.price= 699.99;
		
		cellPhone1.call(743278862);

		cellPhone1.message(798876563);
		
		cellPhone1.takePhoto();
	}

}
