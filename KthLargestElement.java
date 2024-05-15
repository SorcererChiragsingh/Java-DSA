// Leetcode:- https://leetcode.com/problems/kth-largest-element-in-an-array/description/
// Leet Code Question no. 215
// Kth Largest Element in an Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=ockS2ZKh7j8&ab_channel=AlgorithmsMadeEasy

// Meddium
/**
 * With Sorting
 
import java.util.Arrays;

{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        return nums [nums.length-k];
    }
}
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int main_max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i]) +1);
            }else{
                hm.put(nums[i],1);
            }
            main_max = Math.max(main_max,nums[i]);
        }
        if(hm.size()==1){
            return main_max;
        }
        k -= hm.get(main_max);
        while(k>0){
            main_max--;
            if(hm.containsKey(main_max)){
                k -= hm.get(main_max);
            }
        }
        return main_max;
    }
}