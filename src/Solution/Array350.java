package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0, b = 0;
        //去重复用HashSet，不去重复用ArrayList
        List<Integer> res = new ArrayList<>();
        while (a < nums1.length && b < nums2.length) {
            if (nums1[a] == nums2[b]) {
                res.add(nums1[a]);
                a++;
                b++;
            } else if (nums1[a] < nums2[b])
                a++;
            else
                b++;
        }
        int[] result = new int[res.size()];
        int index = 0;
        for (int num : res) {
            result[index] = num;
            index++;
        }
        return result;

    }
}
