// Leetcode:- https://leetcode.com/problems/find-the-closest-palindrome/description/?envType=daily-question&envId=2024-08-24
// Leet Code Question no. 564
// Find the Closest Palindrome Problem DSA
// Solution:- https://www.youtube.com/watch?v=PTVYvSd9gUw ; https://www.youtube.com/watch?v=TOqxzXrSAPY&t=10s

// https://leetcode.com/problems/find-the-closest-palindrome/solutions/5681828/100-runtime-o-n-c-java-explanation
// https://leetcode.com/problems/find-the-closest-palindrome/solutions/5675172/o-1-beats-100-c-java-python-go-rust-javascript
// https://leetcode.com/problems/find-the-closest-palindrome/solutions/5685871/maths-solution
// String Problem

// Hard

// T.C = o(n)
// S.C = o(n)

/**
Given a string n representing an integer, return the closest integer (not including itself), 
which is a palindrome. If there is a tie, return the smaller one.
The closest is defined as the absolute difference minimized between two integers.
*/

import java.util.HashSet;
import java.util.Set;

/**
 Example 1:
Input: n = "123"
Output: "121"

 */

public class ClosestPalindrome 
{
    public String nearestPalindromic(String n) {
        int length = n.length();
        Set<String> candidates = new HashSet<>();

        // Edge cases
        if (n.equals("1")) return "0";

        // Create the prefix
        String prefix = n.substring(0, (length + 1) / 2);
        long prefixNumber = Long.parseLong(prefix);

        // Generate candidates
        for (long i : new long[] {-1, 0, 1}) {
            String newPrefix = Long.toString(prefixNumber + i);
            String candidate;
            if (length % 2 == 0) {
                candidate = newPrefix + new StringBuilder(newPrefix).reverse().toString();
            } else {
                candidate = newPrefix + new StringBuilder(newPrefix.substring(0, newPrefix.length() - 1)).reverse().toString();
            }
            candidates.add(candidate);
        }

        // Edge case for number with one more digit or one less digit
        candidates.add(Long.toString((long)Math.pow(10, length - 1) - 1));
        candidates.add(Long.toString((long)Math.pow(10, length) + 1));

        // Remove the original number from candidates
        candidates.remove(n);

        // Find the closest palindrome
        String closestPalindrome = "";
        long minDifference = Long.MAX_VALUE;
        long num = Long.parseLong(n);
        for (String candidate : candidates) {
            long candidateNum = Long.parseLong(candidate);
            long difference = Math.abs(candidateNum - num);
            if (difference < minDifference || (difference == minDifference && candidateNum < Long.parseLong(closestPalindrome))) {
                minDifference = difference;
                closestPalindrome = candidate;
            }
        }

        return closestPalindrome;
    }
}
/**
 class Solution {
    public String nearestPalindromic(String numberStr) {
        long number = Long.parseLong(numberStr);
        if (number <= 10) return String.valueOf(number - 1);
        if (number == 11) return "9";

        int length = numberStr.length();
        long leftHalf = Long.parseLong(numberStr.substring(0, (length + 1) / 2));
        
        long[] palindromeCandidates = new long[5];
        palindromeCandidates[0] = generatePalindromeFromLeft(leftHalf - 1, length % 2 == 0);
        palindromeCandidates[1] = generatePalindromeFromLeft(leftHalf, length % 2 == 0);
        palindromeCandidates[2] = generatePalindromeFromLeft(leftHalf + 1, length % 2 == 0);
        palindromeCandidates[3] = (long)Math.pow(10, length - 1) - 1;
        palindromeCandidates[4] = (long)Math.pow(10, length) + 1;

        long nearestPalindrome = 0;
        long minDifference = Long.MAX_VALUE;

        for (long candidate : palindromeCandidates) {
            if (candidate == number) continue;
            long difference = Math.abs(candidate - number);
            if (difference < minDifference || (difference == minDifference && candidate < nearestPalindrome)) {
                minDifference = difference;
                nearestPalindrome = candidate;
            }
        }

        return String.valueOf(nearestPalindrome);
    }

    private long generatePalindromeFromLeft(long leftHalf, boolean isEvenLength) {
        long palindrome = leftHalf;
        if (!isEvenLength) leftHalf /= 10;
        while (leftHalf > 0) {
            palindrome = palindrome * 10 + leftHalf % 10;
            leftHalf /= 10;
        }
        return palindrome;
    }
}

//https://leetcode.com/problems/find-the-closest-palindrome/submissions/1364740180/
 */


 /**
  class Solution {
    public String nearestPalindromic(String n) {
        int len = n.length();
        int i = len%2 ==0 ? len/2 -1 : len/2;
        long firstHalf = Long.parseLong(n.substring(0, i+1));

        List<Long> p = new ArrayList<>();

        p.add(halfTo(firstHalf, len%2 == 0));
        p.add(halfTo(firstHalf+1, len%2 == 0));
        p.add(halfTo(firstHalf-1, len%2 == 0));
        p.add((long) Math.pow(10, len-1)-1);
        p.add((long) Math.pow(10, len)+1);

        long diff = Long.MAX_VALUE, res=0, n1 = Long.parseLong(n);
        for(long cand : p){
            if(cand==n1) continue;
            if(Math.abs(cand-n1)<diff){
                diff= Math.abs(cand-n1);
                res=cand;
            }else if(Math.abs(cand-n1)==diff){
                res=Math.min(res,cand);
            }
        }
        return String.valueOf(res);

    }

    private long halfTo(long left, boolean even){
        long res = left;
        if(!even) left /=10;
        while(left>0){
            res = res*10+(left%10);
            left/=10;
        }
        return res;
    }
}
    https://leetcode.com/problems/find-the-closest-palindrome/solutions/5685871/maths-solution
  */