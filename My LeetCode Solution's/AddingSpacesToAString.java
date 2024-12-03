// Leetcode:- https://leetcode.com/problems/adding-spaces-to-a-string/description/?envType=daily-question&envId=2024-12-03
// Leet Code Question no. 2109
// Adding Spaces to a String Problem DSA
// Youtube Solution:- https://www.youtube.com/watch?v=a_-iGNtoDD0&ab_channel=codestorywithMIK ; 

// https://leetcode.com/problems/adding-spaces-to-a-string/solutions/6106383/beats-100-two-pointers-stringbuilder-solution-for-leetcode-2109 (9ms)(Beats 98.69%)
// Array; Two Pointers; String; Simulation Problem
// Medium

// T.C = O(n),
// S.C = O(n+m), 

/**
- You are given a 0-indexed string s and a 0-indexed integer array spaces that describes the indices in the original string where spaces will be added. 
Each space should be inserted before the character at the given index.

- For example, given s = "EnjoyYourCoffee" and spaces = [5, 9], we place spaces before 'Y' and 'C', which are at indices 5 and 9 respectively. Thus, we obtain "Enjoy Your Coffee".
- Return the modified string after the spaces have been added.
*/

/**
 Example:

Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
Output: "Leetcode Helps Me Learn"
Explanation: 
The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
We then place spaces before those characters.

*/

// Method using 2 Pointers
// 

public class AddingSpacesToAString 
{
    public class Main 
    {
        public static void main(String[] args) 
        {
            // Instantiate the AddingSpacesToAString class
            AddingSpacesToAString adder = new AddingSpacesToAString();
    
            // Example input string and spaces array
            String input = "LeetcodeHelpsMeLearn";
            int[] spaces = {8, 13, 15};
    
            // Call the addSpaces method
            String result = adder.addSpaces(input, spaces);
    
            // Print the result
            System.out.println("Original String: " + input);
            System.out.println("Spaces Positions: " + java.util.Arrays.toString(spaces));
            System.out.println("Resulting String: " + result);
        }
    }
    
    public String addSpaces(String s, int[] spaces) 
    {
        int n=s.length();
        int m=spaces.length;
        char[] newChrs=new char[n+m];
        char[] sChr=s.toCharArray();

        int i=0;
        int idx=0;
        for(int spc:spaces)
        {
            while(i<spc)
            {                
                newChrs[idx++]=sChr[i];
                i++;                
            }   
            newChrs[idx++]=' ';
        }
        
        //For last finishing
        while(i<n)
        {                
            newChrs[idx++]=sChr[i];
            i++;                
        }   

        return new String(newChrs);
    }
}


/* (9ms) (98.69%)
public class AddingSpacesToAString 
{
public String addSpaces(String s, int[] spaces) 
{
        int n=s.length();
        int m=spaces.length;
        char[] chrs=new char[n+m];

        int i=0,j=0;
        for(char chr:s.toCharArray()){
            if(j<m && i==spaces[j]){
                chrs[i+j]=' ';
                j++;
            }
            chrs[i+j]=chr;
            i++;
        }

        return new String(chrs);
    }
}
*/

/** (11ms) (95.41%)
public class AddingSpacesToAString 
{
    public String addSpaces(String s, int[] spaces) 
    {
        int n=s.length();
        int m=spaces.length;
        char[] chrs=new char[n+m];

        int j=0;
        for(int i=0; i<n; i++){
            if(j<m && i+j==spaces[j]+j)
            {
                chrs[i+j]=' ';
                j++;
            }
            chrs[i+j]=s.charAt(i);
        }

        return new String(chrs);
    }
}
*/