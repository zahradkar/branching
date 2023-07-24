import java.util.HashMap;
import java.util.Map;

public class DirectionReductions {
    public static void main(String[] args) {
        System.out.println(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }

    private static String dirReduc(String[] input) {
        Map<String, Short> mapa = new HashMap<>();
        /*for (short i = 0; i < input.length; i++)
            if (!mapa.containsKey(input[i]))
                mapa.put(input[i], (short) 1);
            else
                mapa.put(input[i], (short) (mapa.get(input[i]) + 1));*/
			
        for (String s: input)
            if (!mapa.containsKey(s))
                mapa.put(s, (short) 1);
            else
                mapa.put(s, (short) (mapa.get(s) + 1));

        if (mapa.get("WEST") > mapa.get("EAST"))
            return "WEST";
        if (mapa.get("EAST") > mapa.get("WEST"))
            return "EAST";
        if (mapa.get("NORTH") > mapa.get("SOUTH"))
            return "NORTH";
        if (mapa.get("SOUTH") > mapa.get("NORTH"))
            return "SOUTH";

        return "";
    }
}
