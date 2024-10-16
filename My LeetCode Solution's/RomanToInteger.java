// Leetcode:- https://leetcode.com/problems/roman-to-integer/description/
// Leet Code Question no. 13
// Roman to Integer Problem DSA
// Solution:- https://www.youtube.com/watch?v=pUV_4YeJzjM&ab_channel=CodingSphere


// Basic Maths Problem

// Easy

// T.C = o(n)
// S.C = o(n)

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
