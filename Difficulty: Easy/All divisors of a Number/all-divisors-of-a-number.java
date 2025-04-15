//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static void print_divisors(int n) {
        if(n==1)
        {
          System.out.print(1);
          return;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int j =0;
        for(int i =1;i*i<=n;i++)
        {
            if(n%i==0)
             {
                 System.out.print(i+" ");
                 result.add(i);
                
             }
        }
        for(int k = result.size()-1;k>=0;k--)
        {
            if(result.get(k)!=n/result.get(k) )
            System.out.print(n/result.get(k) +" ");
        }
    }
}
