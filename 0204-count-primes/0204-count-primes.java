class Solution {
    public int countPrimes(int n) {
        if(n<2)
         return 0;
        boolean[] sieve = new boolean[n];
        Arrays.fill(sieve,true);
        sieve[0] = sieve[1] = false;
        for(int i =2;i*i<n;i++)
        {
            if(sieve[i])
            {
                for(int j=i*i;j<n;j+=i)
                    sieve[j]=false;
            }
        }
        int primeCount =0;
        for(boolean prime:sieve)
        {
            if(prime)
              primeCount++;
        }
        return primeCount;

    }
}