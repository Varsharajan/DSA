class Solution {
public:
    int commonFactors(int a, int b) {
        int n,count =0;
        n =min(a,b);
        for(int i=1;i<=n;i++)
        {
            if(a%i==0 && b%i==0)
               count++;
        }
        return count;
    }
};