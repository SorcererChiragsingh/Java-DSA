// Leetcode:- https://leetcode.com/problems/uncommon-words-from-two-sentences/description/?envType=daily-question&envId=2024-09-17
// Leet Code Question no. 884
// Uncommon Words from Two Sentences Problem DSA
// Solution:- 

// https://leetcode.com/problems/uncommon-words-from-two-sentences/solutions/5797547/easy-to-understandable-solution-with-100-beats

// Hash Table; String; Counting
// Easy

// T.C = o(n+k) where n is the total length of both input strings combined.
// S.C = o(n+k) where n is the total length of both sentences, and k is the number of distinct words.
/**
A sentence is a string of single-space separated words where each word consists only of lowercase letters.
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
*/

import java.util.ArrayList;
import java.util.HashMap;

/**
 Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Explanation:
The word "sweet" appears only in s1, while the word "sour" appears only in s2.
 */

public class UncommonWordsfromTwoSentences 
{
    // Main method to test the class
    public static void main(String[] args) 
    {
        UncommonWordsfromTwoSentences obj = new UncommonWordsfromTwoSentences();
        
        String s1 = "apple banana apple";
        String s2 = "banana orange";

        // Get the uncommon words
        String[] result = obj.uncommonFromSentences(s1, s2);

        // Print the result
        System.out.println("Uncommon words are: ");
        for (String word : result) 
        {
            System.out.println(word);
        }
   }    
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        String str1[]=s1.split(" ");
        String str2[]=s2.split(" ");
       

        HashMap<String, Integer>wordCount=new HashMap<>();
        for(String str:str1)
        {
           wordCount.put(str, wordCount.getOrDefault(str, 0)+1);
        }
          for(String str:str2)
        {
            wordCount.put(str, wordCount.getOrDefault(str, 0)+1);
        }
         ArrayList<String>list=new ArrayList<>();
         for(String str:wordCount.keySet())
         {
            if(wordCount.get(str)==1)
            {
                list.add(str);
            }
         }
        return list.toArray(new String[list.size()]);
    }

}
