import java.io.*;
import java.util.*;


/**
 * TODO: Explain approach
 */
class LC1732FindHighestAltitudePrefixSum {
    public static int largestAltitude(int[] gain) {

        int min = Integer.MIN_VALUE;
        List<Integer> altitude = new ArrayList<>();
        altitude.add(0);
        
        for (int i = 1; i <= gain.length; i++) 
            altitude.add(gain[i-1] + altitude.get(i-1));
        
        return Collections.max(altitude);
    }

    public static void main(String[] args) {
        int gain[] = new int[]{-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
