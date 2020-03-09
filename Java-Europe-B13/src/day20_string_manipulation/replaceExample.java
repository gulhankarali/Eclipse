package day20_string_manipulation;

public class replaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Coding, is my hobby";
		
		String withNoSpace= str.replace(" ","").replace("o","O");
		
		System.out.println(withNoSpace);
		
		System.out.println(str);
		
		String newOne = str.replace(",", "!");
	
		System.out.println(newOne);
		
		String result="About 8,930,000,000 results (0,68 seconds)";
		
		String newString= result.replace("About ","").replace(" results (0,68 seconds)", "");
		
		System.out.println(newString);
	}

}
