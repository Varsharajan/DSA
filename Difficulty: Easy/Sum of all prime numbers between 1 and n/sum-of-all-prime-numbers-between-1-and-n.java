//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GfG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.prime_Sum(n);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int prime_Sum(int n) {
        // code here
        boolean[] result = new boolean[n+1];
        Arrays.fill(result,true);
        result[0]=result[1] = false;
        for(int i =2;i*i<=n;i++)
        {
            if(result[i])
            {
                for(int j =i*i;j<=n;j+=i)
                   result[j]=false;
            }
        }
        int sum =0;
        for(int i =2;i<=n;i++)
        {
            if(result[i])
              sum+=i;
        }
        return sum;
        
    }
}