//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    
    //Recrusion
    
    /*
    int countWays(int n)
    {
        
        // your code here
        if(n<=1) return 1;
        
        int left=countWays(n-1);
        int right= countWays(n-2);
        
        return left+right;
        
        
        
    }*/
    
    //memoization
    /*
    int countWays(int n)
    {
        
        // your code here
        if(n<=1) return 1;
        
        int dp[]=new int[n+1];
        
        //fill all element in the array as -1
        Arrays.fill(dp,-1);
        
        if(dp[n]!=-1) return dp[n];
        
        return dp[n]=countWays(n-1)+countWays(n-2);
        
    }
    */
    
    
    
    int countWays(int n)
    {
        
        
        // your code here
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
       
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1] + dp[i-2] )%1000000007;
        }
        return dp[n];
    }
        
}

