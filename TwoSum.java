import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Time Complexity O(n), Space Complextiy O(1) */

class TwoSum {

    public static void main(String args[]) {

        int nums[] = { 1, 4, 0, 0, 11, 15 };
        int target = 7;
        int[] outPut = getSum(target, nums);
        System.out.println("resut" + Arrays.toString(outPut));
    }

    public static int[] getSum(int target, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        if (nums.length <= 0) {
            return null;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if (map.containsKey(b)) {
                return new int[] { map.get(b), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}