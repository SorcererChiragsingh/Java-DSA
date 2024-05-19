// Leetcode:- https://leetcode.com/problems/subarray-sum-equals-k/description/
// Leet Code Question no. 560
// Subarray Sum Equals K Problem DSA
// Solution:- https://www.youtube.com/watch?v=xvNwoz-ufXA&ab_channel=takeUforward ; https://www.youtube.com/watch?v=XzwUBIkR9pA&ab_channel=AnujBhaiya

// https://leetcode.com/problems/subarray-sum-equals-k/solutions/2680278/java-solution-with-explanatory-notes
//

// Medium

// T.C = o(n)
// S.C = o(n)
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK 
{
    public static int subarraySum(int[] nums, int k) 
    {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) 
        {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) 
            {
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

/**
 Class:- SubarraySumEqualsK
 Method:- subarraySum
The class SubarraySumEqualsK is defined with a method subarraySum that takes an integer array nums and an integer k as parameters.
The method returns the count of subarrays whose sum is equal to k.

sum - is used to keep track of the cumulative sum of the elements as we iterate through the array.
result - will store the count of subarrays that sum up to k.
preSum - is a HashMap that stores the cumulative sum (sum) as the key and the number of times this sum has occurred as the value. It is initialized with (0, 1) because a sum of 0 has occurred once by default (considering an empty subarray).

The loop iterates through each element of the array nums.
sum is updated by adding the current element nums[i] to the cumulative sum.
The condition if (preSum.containsKey(sum - k)) checks if there exists a cumulative sum that, 
when subtracted from the current cumulative sum, equals k. If so, it means there is a subarray that sums to 𝑘.

result is incremented by the value associated with the key sum - k in the preSum map, indicating the number of times this particular cumulative sum has been encountered.
The preSum map is updated to include the current cumulative sum (sum). If this sum is already present, its count is incremented by 1; otherwise, it is added to the map with a count of 1.
*/