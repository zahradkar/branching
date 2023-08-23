import java.util.List;
import java.util.ArrayList;

public class CombineLists{
	public static void main(String[] args){
		List<String> in1 = new ArrayList<>();
		in1.add("apple");
		in1.add("orange");
		
		List<String> in2 = new ArrayList<>();
		in2.add("cat");
		in2.add("dog");
		
		System.out.println(combine(in1, in2));
		
		in1.add("banana");
		in1.add("watermelon");
		
		System.out.println(combine(in1, in2));
		
	}
	
	private static List<String> combine(List<String> in1, List<String> in2){
		List<String> result = new ArrayList<>(in1.size() + in2.size());
		for (int i=0; i<in1.size()+in2.size(); i++){
			if (i<in1.size())
				result.add(in1.get(i));
			if (i<in2.size())
				result.add(in2.get(i));
		}
		return result;
	}
}