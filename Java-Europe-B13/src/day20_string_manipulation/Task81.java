package day20_string_manipulation;

public class Task81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = convert ("20/20/2019 13:30:30");
		
		System.out.println(str);
		
		String chars="{{}}";
		
		String word = "AUTOMATION";
		
		System.out.println(chars.substring(0,2).concat(word).concat(chars.substring(2)));
		
		String str2 = "   342   ";
		
		String yeni = str2.trim();
		
		yeni = "|"+yeni.concat("|");
		
		System.out.println(yeni);
		
	System.out.println(word.substring(3,8));
		
			
		System.out.println(word.indexOf("T",3));
		
		
		
	}

	private static String convert(String string) {
		// TODO Auto-generated method stub

		String str= string.replace("/","").replace(":","").replace(" ","");
		return str;
	}

}
