//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public long prime_Sum(int n) {
       boolean[] sieve = new boolean[n+1];
       long result =0;
       Arrays.fill(sieve,true);
       sieve[0] = false;
       sieve[1] = false;
       for(int i =2;i*i<=n;i++)
       {
           if(sieve[i])
           {
               for(int j= i*i;j<=n;j+=i)
               {
                   sieve[j]= false;
               }
           }
       }
       
       for(int i=2;i<=n;i++)
       {
           if(sieve[i])
               result+=i;
               
       }
       return result;
        
    }
}