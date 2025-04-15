//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static long sumOfDivisors(long n) {
      long result =0;
      for(long i =1;i<=n;i++)
      {
          result +=(n/i)*i;
      }
      return result;
    }
}


//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.sumOfDivisors(n);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends