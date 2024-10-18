// Leetcode:- https://leetcode.com/problems/roman-to-integer/description/
// Leet Code Question no. 13
// Roman to Integer Problem DSA
// Solution:- https://www.youtube.com/watch?v=pUV_4YeJzjM&ab_channel=CodingSphere


// Hash Table; Math; String Problem
// Easy

// T.C = o(n)
// S.C = o(n)
/**
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

* For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. 
The number 27 is written as XXVII, which is XX + V + II.
* Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

- I can be placed before V (5) and X (10) to make 4 and 9. 
- X can be placed before L (50) and C (100) to make 40 and 90. 
- C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
*/

/**
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
*/

public class RomanToInteger 
{
    public int getval (char ch)
    {
        switch (ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) 
    {
        int n = s.length();
        int Sum = 0;
        for (int i = 0; i<n ; i++)
        {
            char ch1 = s.charAt(i);
            if ((i+1) < n && getval (ch1) < getval (s.charAt (i+1)))
            Sum = Sum-getval(ch1);
            else
            Sum = Sum + getval (ch1);
        }
        return Sum;
    }
        public static void main(String[] args) 
    {
        RomanToInteger converter = new RomanToInteger();
        String romanNumeral = "MCMXCIV"; // Example input
        int result = converter.romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}
