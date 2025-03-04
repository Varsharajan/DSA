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
      List<Integer> smallDiv = new ArrayList<>();
      List<Integer> largeDiv = new ArrayList<>();
      
      for(int i =1;i*i<=n;i++)
      {
          if(n%i==0)
          {
             smallDiv.add(i);
             if(i!=(n/i))
             {
               largeDiv.add(n/i);
             }
          }
          
             
      }
      for(int num:smallDiv)
        System.out.print(num+" ");
    
      for (int i = largeDiv.size()-1; i >= 0; i--)
        System.out.print(largeDiv.get(i)+" ");
      
      
    }

};
