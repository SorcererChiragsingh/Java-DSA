// Leetcode:- https://leetcode.com/problems/xor-queries-of-a-subarray/description/?envType=daily-question&envId=2024-09-13
// Leet Code Question no. 1310
// XOR Queries of a Subarray Problem DSA
// Solution:- 

// https://leetcode.com/problems/xor-queries-of-a-subarray/solutions/5778700/beats-100-explained-with-video-c-java-python-js-prefix-xor-explained-in-detail

// Array; Bit Manipulation; Prefix Sum
// Medium

// T.C = o()
// S.C = o()

/**
You are given an array arr of positive integers. You are also given the array queries where queries[i] = [lefti, righti].
For each query i compute the XOR of elements from lefti to righti (that is, arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti] ).
Return an array answer where answer[i] is the answer to the ith query.
*/

/**
Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8] 

Explanation: 
The binary representation of the elements in the array are:
1 = 0001 
3 = 0011 
4 = 0100 
8 = 1000 
The XOR values for queries are:
[0,1] = 1 xor 3 = 2 
[1,2] = 3 xor 4 = 7 
[0,3] = 1 xor 3 xor 4 xor 8 = 14 
[3,3] = 8
*/

public class XORSubarray 
{
    public static void main(String[] args) // main class
    {
        XORSubarray xorSubarray = new XORSubarray();

        // Example input array
        int[] arr = {1, 3, 4, 8};

        // Example queries
        int[][] queries = 
        {
            {0, 1}, 
            {1, 2}, 
            {0, 3}, 
            {3, 3}
        };

        // Get the result of the queries
        int[] result = xorSubarray.xorQueries(arr, queries);

        // Print the results
        for (int res : result) 
        {
            System.out.println(res);
        }
    }
    public int[] xorQueries(int[] arr, int[][] queries) 
    {
        int n=arr.length;
        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++) 
        {
            pre[i]=pre[i-1]^arr[i];
        }
        int[] res=new int[queries.length];
        for(int k=0;k<queries.length;k++) 
        {
            int i=queries[k][0];
            int j=queries[k][1];
            if(i==0) 
            {
                res[k]=pre[j];
            } else 
            {
                res[k]=pre[j]^pre[i-1];
            }
        }
        return res;
    }

}
