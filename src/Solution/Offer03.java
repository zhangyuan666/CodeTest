package Solution;

import java.util.HashSet;
import java.util.Set;

public class Offer03 {

    public int findRepeatNumber(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num))
                return num;
        }
        return 0;
    }
}