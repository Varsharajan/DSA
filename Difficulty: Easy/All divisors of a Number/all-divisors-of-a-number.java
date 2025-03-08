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
       List<Integer> list1 = new ArrayList<>(); 
       List<Integer> list2 = new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                list1.add(i);
                if((n/i)!=i)
                 list2.add(n/i);
            }
        }
        
        for(int i =0;i<list1.size();i++)
          System.out.print(list1.get(i)+" ");
        for(int i = list2.size()-1;i>=0;i--)
           System.out.print(list2.get(i)+" ");
    }
}
