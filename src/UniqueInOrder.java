public class UniqueInOrder{
	public static void main(String[] args){
		String input = "AAAABBBCCDAABBB"; // 'A', 'B', 'C', 'D', 'A', 'B'
		System.out.println(uniqueInOrder(input));
		
		input = "ABBCcAD"; // 'A', 'B', 'C', 'c', 'A', 'D'
		System.out.println(uniqueInOrder(input));
		
		input = "12233"; // 1, 2, 3
		System.out.println(uniqueInOrder(input));
	}
	
	private static String uniqueInOrder(String input){
		StringBuilder result = new StringBuilder();
		if (input.isEmpty())
			return input;
		else
			result.append(input.charAt(0));
		
		for (int i=1; i<input.length(); i++)
			if (input.charAt(i) != result.charAt(result.length()-1))
				result.append(input.charAt(i));
		return result.toString();
	}
}