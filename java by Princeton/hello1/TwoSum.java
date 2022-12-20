/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else
                map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] sum = new int [4];
        sum[0] = 2;
        sum[1] = 7;
        sum[2] = 9;
        sum[3] = 15;
        System.out.println(twoSum(sum, 9).toString());
    }
}

