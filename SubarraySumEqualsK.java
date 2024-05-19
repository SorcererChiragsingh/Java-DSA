// Leetcode:- https://leetcode.com/problems/subarray-sum-equals-k/description/
// Leet Code Question no. 560
// Subarray Sum Equals K Problem DSA
// Solution:- https://www.youtube.com/watch?v=xvNwoz-ufXA&ab_channel=takeUforward ; https://www.youtube.com/watch?v=XzwUBIkR9pA&ab_channel=AnujBhaiya

// https://leetcode.com/problems/subarray-sum-equals-k/solutions/2680278/java-solution-with-explanatory-notes
//

// Medium

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK 
{
    public static int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
    public static void main(String[] args) 
    {
        int[] nums = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        int result = subarraySum(nums, k);
        System.out.println("The number of subarrays is: " + result);
    }

}
