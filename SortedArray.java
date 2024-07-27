// Leetcode:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Leet Code Question no. 26
// Remove Duplicates from Sorted Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=JHzdGAh_6mk&ab_channel=CollegeWallah

public class SortedArray {
    public static void main(String[] args) {
        // Initialize an array with duplicates
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        // Create an instance of SortedArray
        SortedArray sa = new SortedArray();

        // Remove duplicates and get the new length
        int newLength = sa.removeDuplicates(nums);

        // Print the result
        System.out.println("The new length after removing duplicates is: " + newLength);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}


/**class SortedArray 
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
*/
