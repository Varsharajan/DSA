class Solution {
public:
    int reverse(int x) {
        int rev =0;
        while(x!=0)
        {
            // it is to avoid overflow condition and stop earlier if we will be going out of bound for eg: 2^31-1 =2,14,74,83,647 and if r> than (2,14,74,83,647/10=2,14,74,83,64) this is a certain condition that in next iteration the number will be greater than 2,14,74,83,647 this even there will be zero
             if(rev>INT_MAX/10 || rev<INT_MIN/10)
             return 0;
            rev = rev*10+(x%10);
            x = x/10;
        }
       
        return rev;
      
    }
};