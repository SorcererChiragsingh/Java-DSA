// Leetcode:- https://leetcode.com/problems/majority-element/description/
// Leet Code Question no. 169
// Majority Element Problem DSA
// Solution:- https://www.youtube.com/watch?v=1r8kzrXJiUk&ab_channel=Technosage; https://www.youtube.com/watch?v=PUCEWmefFm4&ab_channel=Codebix

// Easy
// Moore's voting algorithm

/**
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array. 
*/

/**
Example 1:

Input: nums = [3,2,3]
Output: 3
*/
public class MajorityElement 
{
    public static void main(String[] args)
    {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(Majorityelement(nums));

    }

    public static int Majorityelement(int[] nums)
    {
 // cand = candidate       
            int cand=0;
            int count=0;
            for(int i=0;i<nums.length;i++)
            {
                if(count==0)
                {
                    cand=nums[i];
                }

                if(cand==nums[i])
                {
                    count++;
                }
                else
                {
                    count--;
                }

            }
    return cand;

    }
}