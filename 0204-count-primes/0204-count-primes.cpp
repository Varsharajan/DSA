class Solution {
public:
    int countPrimes(int n) {
        if(n==0||n==1)
          return 0;
          int count =0;
         vector<bool> sieve(n+1,true);
         for(int i =2;i*i<=n;i++)
         {
            if(sieve[i])
            {
                for(int j = i*i;j<=n;j+=i)
                {
                    sieve[j]= false;
                }
            }
         }

         for(int i =2;i<n;i++)
         {
            if(sieve[i])
              count++;
         }
         return count;

    }
};