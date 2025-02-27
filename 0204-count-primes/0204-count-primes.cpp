class Solution {
public:
    int countPrimes(int n) {
        if(n<3)
          return 0;
          int count =0;
         vector<bool> sieve(n+1,true);
         for(int i =2;i<n;i++)
         {
            if(sieve[i])
            {
                count++;
                for(int j=2*i;j<=n;j+=i)
                {
                    sieve[j]= false;
                }
            }
         }
         return count;

    }
};