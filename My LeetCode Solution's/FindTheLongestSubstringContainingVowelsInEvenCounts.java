// Leetcode:- https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/description/?envType=daily-question&envId=2024-09-15
// Leet Code Question no. 1371
// Find the Longest Substring Containing Vowels in Even Counts Problem DSA
// Solution:- 

// Hash Table; String; Bit Manipulation; Prefix Sum Problem

// Medium

// T.C = o(n)
// S.C = o(1)

// Given the string s, return the size of the longest substring containing each vowel an even number of times. 
// That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.



/** 
Example 1:

Input: s = "eleetminicoworoep"
Output: 13
Explanation: The longest substring is "leetminicowor" which contains two each of the vowels: e, i and o and zero of the vowels: a and u.
*/

// https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/solutions/5788570/how-to-reach-for-bit-masking-intuition-explained-for-beginners
import java.util.Arrays;

public class FindTheLongestSubstringContainingVowelsInEvenCounts 
{
    public int findTheLongestSubstring(String s) 
    {
        // Vowel map for the vowels a, e, i, o, u
        int vowelMap[] = new int[26];     
        vowelMap['a' - 'a'] = 1;    // 00001
        vowelMap['e' - 'a'] = 2;    // 00010
        vowelMap['i' - 'a'] = 4;    // 00100
        vowelMap['o' - 'a'] = 8;    // 01000
        vowelMap['u' - 'a'] = 16;   // 10000

        int longest = 0;    
        int prefixXor = 0; 
        int xorArr[] = new int[32];  // To store prefix XOR states for each bitmask
        Arrays.fill(xorArr, -1);     // Initialize array to -1 for unseen states
        xorArr[0] = 0;               // Base case: for an empty substring, the prefixXor is 0

        for (int i = 0; i < s.length(); i++) 
        {
            // Update the prefixXor if current character is a vowel
            prefixXor ^= vowelMap[s.charAt(i) - 'a'];
            
            // If this prefixXor was seen before, calculate the substring length
            if (xorArr[prefixXor] == -1) 
            {
                xorArr[prefixXor] = i + 1;
            } else 
            {
                longest = Math.max(longest, i + 1 - xorArr[prefixXor]);
            }
        }
        
        return longest;
    }

    public static void main(String[] args) 
    {
        FindTheLongestSubstringContainingVowelsInEvenCounts solver = new FindTheLongestSubstringContainingVowelsInEvenCounts();
        
        // Example 1
        String s1 = "eleetminicoworoep";
        System.out.println("Longest substring length (s1): " + solver.findTheLongestSubstring(s1));
        
        // Example 2
        String s2 = "leetcodeisgreat";
        System.out.println("Longest substring length (s2): " + solver.findTheLongestSubstring(s2));
        
        // Example 3
        String s3 = "bcbcbc";
        System.out.println("Longest substring length (s3): " + solver.findTheLongestSubstring(s3));
    }
}


/** Method 1
 * https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/solutions/5788020/easy-solution-beats-99
import java.util.HashMap;
public class FindTheLongestSubstringContainingVowelsInEvenCounts 
{
    public int findTheLongestSubstring(String s) 
    {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int cnt = 0, ans = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
            {
                cnt ^= (1 << ((int)(s.charAt(i) - 'a'))); // Check if a character is a vowel: If the current character is a vowel (a, e, i, o, u), it updates the cnt bitmask by XOR-ing it with 1 << (s.charAt(i) - 'a'). This toggles the corresponding bit for that vowel
            }
            if (mp.containsKey(cnt)) 
            {
                ans = Math.max(ans, i - mp.get(cnt));
            } else 
            {
                mp.put(cnt, i);
            }
        }
        return ans;
    }
}
*/

/** Method 2
 * https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/solutions/5789065/really-me-accha-question-chalo-padhe-concept

import java.util.HashMap;
public class FindTheLongestSubstringContainingVowelsInEvenCounts 
{
    private boolean isVowel(char ch) 
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int findTheLongestSubstring(String s) 
    {
        // Map vowels to their respective positions in the bitmask
        HashMap<Character, Integer> vowelPosition = new HashMap<>();
        vowelPosition.put('a', 0);
        vowelPosition.put('e', 1);
        vowelPosition.put('i', 2);
        vowelPosition.put('o', 3);
        vowelPosition.put('u', 4);

        // HashMap to store the first occurrence of each state
        HashMap<Integer, Integer> lastOccurred = new HashMap<>();
        lastOccurred.put(0, -1); // Initial state with no vowels seen
        
        int cur = 0; // Bitmask to track the parity of vowel counts
        int maxLen = 0; // Result variable to store the maximum length
        
        for (int r = 0; r < s.length(); r++) 
        {
            char currentChar = s.charAt(r);

            if (isVowel(currentChar)) 
            {
                // Toggle the bit for the current vowel
                cur ^= (1 << vowelPosition.get(currentChar));
            }

            // If the current state has been seen before, calculate the length
            if (lastOccurred.containsKey(cur)) 
            {
                maxLen = Math.max(maxLen, r - lastOccurred.get(cur));
            } else 
            {
                // Store the first occurrence of this state
                lastOccurred.put(cur, r);
            }
        }

        return maxLen;
    }
}

*/