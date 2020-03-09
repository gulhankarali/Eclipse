package day25_arrays;

public class Task94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String info1="This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
				
		String info2= "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		String[] splitOne= info1.split("xxx");
	
		String [] splitTwo= info2.split("xxx");
			
		System.out.println(splitOne[1].concat(splitTwo[1]));
		
		
	}

}
