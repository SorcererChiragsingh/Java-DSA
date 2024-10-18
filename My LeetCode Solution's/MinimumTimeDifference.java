// Leetcode:- https://leetcode.com/problems/minimum-time-difference/description/?envType=daily-question&envId=2024-09-16
// Leet Code Question no. 539
// Minimum Time Difference Problem DSA
// Solution:- 
// https://leetcode.com/problems/minimum-time-difference/solutions/5792464/beats-99-58-easy-solution
// https://leetcode.com/problems/minimum-time-difference/solutions/5793698/100-betas-1ms-java
// https://leetcode.com/problems/minimum-time-difference/solutions/5793338/change-the-time-69-beats-100-easy-solution-with-explanation

// Array; Math; String; Sorting Problem

// Medium

// T.C = o()
// S.C = o()
/**
Given a list of 24-hour clock time points in "HH:MM" format, 
return the minimum minutes difference between any two time-points in the list.
*/


/** 
Example 1:
Input: timePoints = ["23:59","00:00"]
Output: 1
*/
import java.util.Arrays;
import java.util.*;

public class MinimumTimeDifference 
{
    public static int findMinDifference(List<String> timePoints) 
    {
        int n = timePoints.size();
        int[] minutes = new int[n];

        for (int i = 0; i < n; i++) {
            minutes[i] = getMinutes(timePoints.get(i));
        }

        Arrays.sort(minutes);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            minDiff = Math.min(minDiff, minutes[i + 1] - minutes[i]);
        }

        minDiff = Math.min(minDiff, 1440 - (minutes[n - 1] - minutes[0]));

        return minDiff;
    }

    private static int getMinutes(String time) 
    {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    public static void main(String[] args) 
    {
        List<String> timePoints = Arrays.asList("23:59", "00:00", "12:30");
        System.out.println(findMinDifference(timePoints)); // Example usage
    }
}
