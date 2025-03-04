//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        int firstPos = findIndex(arr,target,true);
        int lastPos =   findIndex(arr,target,false);
        if(firstPos ==-1 || lastPos ==-1)
          return 0;
        return lastPos-firstPos+1;
    }
    int findIndex(int[] arr, int target, boolean findFirst)
    {
        int start =0, end = arr.length-1,result =-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target==arr[mid])
            {
                result = mid;
                if(findFirst)
                   end= mid-1;
                else
                  start = mid+1;
            }
            else if(target<arr[mid])
               end = mid-1;
            else
               start = mid+1;
        }
        return result;
    }
}
