import java.util.ArrayList;
import java.util.List;

public class ParseNumbers {
    public static void main(String[] args) {
        //System.out.println(parseNumbers2("1,7"));
        //System.out.println(parseNumbers2("3-5"));
        //System.out.println(parseNumbers2("1,3-57,7"));
        //System.out.println(parseNumbers2("1-9"));
		
		
		int[] vysledok = parseNumbers2("1,3-57,7");
		for (Integer n : vysledok)
			System.out.print(n + ", ");
    }

    private static List<Integer> parseNumbers(String input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++)
            if (input.charAt(i) == '-')
                for (int j = result.get(result.size() - 1); j < Character.getNumericValue(input.charAt(i + 1)); j++)
                    result.add(j);
            else if (input.charAt(i) == ',')
                continue;
            else
                result.add(input.charAt(i) - '0');
        // result.add(Character.getNumericValue(input.charAt(i)));

        return result;
    }

    private static int[] parseNumbers2(String input) {
		String[] temp = input.split(",");
		List<Integer> resultList = new ArrayList<>();
		for (int i=0; i<temp.length; i++)
			if (temp[i].contains("-")){
				String[] temp2 = temp[i].split("-");
				int zac = Integer.parseInt(temp2[0]);
				int kon = Integer.parseInt(temp2[1]);
				for (int j=zac; j<=kon; j++)
					resultList.add(j);
			}	
			else
				resultList.add(Integer.parseInt(temp[i]));

		int[] result = new int[resultList.size()];
		for (int i=0; i<resultList.size(); i++)
			result[i] = resultList.get(i);
        return result;
    }
}