import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BreakOuter {

    private static final Logger logger = Logger.getLogger(BreakOuter.class.getName());
    public static void firstNumsToSum(List<Integer> nums1, List<Integer> nums2, int sum) {
        outer:
        for (Integer n1 : nums1) {
            inner:
            for (Integer n2 : nums2) {
                if (n1 + n2 == sum) {
                    break outer;
                }
                System.out.println("n1=" + n1 + ", n2=" + n2);
            }
            System.out.println("here");
            logger.log(Level.INFO, "here");
        }
    }
}