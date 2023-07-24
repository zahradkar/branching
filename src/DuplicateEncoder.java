public class DuplicateEncoder{
	public static void main(String... args){
		System.out.println(encode("recede"));
		System.out.println(encode("This day is wonderful"));
	}
	
	private static String encode(String input){
		StringBuilder result = new StringBuilder();
		for (short i=0;i<input.length(); i++)
			if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i)))
				result.append("(");
			else
				result.append(")");
		
		return result.toString();
	}
}