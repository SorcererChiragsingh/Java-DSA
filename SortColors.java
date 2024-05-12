// Leetcode:- https://leetcode.com/problems/sort-colors/description/
// Leet Code Question no. 75
// Sort Colors Problem DSA
// Solution:- https://www.youtube.com/watch?v=HuS-ZsnEdbc&ab_channel=Codebix


// Easy

public class SortColors 
{
     public void sortColors(int[] nums) 
    {
        int l= 0, i=0, r = nums.length-1;
        while(i<=r)
        {
            if (nums[i] == 0)
            Swap(nums, l++, i++);
            else if (nums[i] ==2)
            Swap ( nums, i, r--);
            else i++;
        }
    }
    private void Swap ( int[]nums, int p1, int p2)
    {
        int temp = nums[p1];
        nums[p1]= nums[p2];
        nums[p2]= temp;
    }
}
