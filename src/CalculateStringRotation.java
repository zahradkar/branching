public class CalculateStringRotation{
	public static void main(String[] args){
		System.out.println(calculateStringRotation("coffee", "eecoff"));
		System.out.println(calculateStringRotation("eecoff", "coffee"));
		System.out.println(calculateStringRotation("moose", "Moose"));
		System.out.println(calculateStringRotation("isn't", "'tisn"));
		System.out.println(calculateStringRotation("Esham", "Esham"));
		System.out.println(calculateStringRotation("dog", "god"));
	}
	
	private static int calculateStringRotation(String b, String a){
		String temp = "";
		int i = 0;
		for (; i<a.length(); i++)
			if (b.startsWith(a.substring(i))){
				temp = a.substring(i) + a.substring(0,i);
				if (temp.equals(b))
					return i;
			}
		return -1;
	}
}