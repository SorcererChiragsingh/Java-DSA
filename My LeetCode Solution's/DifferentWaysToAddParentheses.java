// Leetcode:- https://leetcode.com/problems/different-ways-to-add-parentheses/description/?envType=daily-question&envId=2024-09-19
// Leet Code Question no. 241
// Different Ways to Add Parentheses Problem DSA
// Solution:- https://leetcode.com/problems/different-ways-to-add-parentheses/solutions/5807285/bhai-pahle-acche-se-recursive-and-memorization-samajhte-hain-use-baad-tabulation-pe-jaayenge

// Math; String; Dynamic Programming; Recursion; Memoization Problem

// Medium

// T.C = o(4^n / √n)
// S.C = o(4^n)

/**
Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. 
You may return the answer in any order.
The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed 104.
*/

/**
Example:-
Input: expression = "2-1-1"
Output: [0,2]

Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2
 */

// https://leetcode.com/problems/different-ways-to-add-parentheses/solutions/5781291/beats-100-best-solution-easy-explaination
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DifferentWaysToAddParentheses 
{
      Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) 
    {
        if(map.containsKey(expression))
        {
            return map.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<expression.length(); i++)
        {
            char ch = expression.charAt(i);
            if(ch=='*' || ch == '+' ||ch=='-')
            {
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for (int l : left) 
                {
                    for (int r : right) 
                    {
                        if (ch == '+') 
                        {
                            result.add(l + r);
                        } else if (ch == '-') 
                        {
                            result.add(l - r);
                        } else if (ch == '*') 
                        {
                            result.add(l * r);
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) 
        {
            result.add(Integer.parseInt(expression));
        }
        map.put(expression, result);

        return result;
        
    }

    public static void main(String[] args) 
    {
        DifferentWaysToAddParentheses obj = new DifferentWaysToAddParentheses();
        String expression = "2*3-4*5";
        List<Integer> result = obj.diffWaysToCompute(expression);
        System.out.println("Possible results: " + result);
    }
}
