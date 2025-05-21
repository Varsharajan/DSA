
// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int origA = a, origB = b;
        int[] result = new int[2];
        while(a>0 && b>0)
        {
            if(a>b)
              a%=b;
             else
              b%=a; 
        }
        result[1]= a==0?b:a;
        result[0] = origA*origB/result[1];
        return result;
    }
}