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
		for (int i=0; i<a.length(); i++)
			if (b.startsWith(a.substring(i)))
				if ((a.substring(i) + a.substring(0,i)).equals(b))
					return i;
		return -1;
	}
}