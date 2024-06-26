// Leetcode:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Leet Code Question no. 26
// Remove Duplicates from Sorted Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=JHzdGAh_6mk&ab_channel=CollegeWallah

class SortedArray 
{
    public int removeDuplicates(int[] nums) 
    {
        int j =0;
        for (int i=0; i < nums.length; i++)
        {
            if(nums[j] != nums[i])
            {
                nums [++j]= nums[i];
            }
        }
        return ++j;
    }
}
