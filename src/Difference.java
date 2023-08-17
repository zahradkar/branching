import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Difference{
	public static void main(String[] args){
		System.out.println(difference(Arrays.asList(1,2,3), Arrays.asList(2,3,4)));
		System.out.println(difference(Arrays.asList(1,2), Arrays.asList(3,4)));
		System.out.println(difference(Arrays.asList(), Arrays.asList()));
	}

	private static List<Integer> difference(List<Integer> list1, List<Integer> list2){
		List<Integer> result = new ArrayList<>();
		for (Integer integer : list1)
			if (!list2.contains(integer))
				result.add(integer);

		return result;
	}
}
