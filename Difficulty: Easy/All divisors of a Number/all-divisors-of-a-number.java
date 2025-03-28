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
      List<Integer> l1 = new ArrayList<>();
      List<Integer> l2 = new ArrayList<>();
      for(int i =1;i*i<=n;i++)
      {
          if(n%i==0)
          {
              l1.add(i);
              if(i!=(n/i))
                 l2.add(n/i);
          }
      }
      for(int nums:l1)
        System.out.print(nums+" ");
      for(int i = l2.size()-1;i>=0;i--)
        System.out.print(l2.get(i)+" ");
      
    }
}
