class Solution {
    public boolean isPalindrome(int x) {
        int oriX = x, rev =0;
        if(x<0)
         return false;

        while(x!=0)
        {
            rev = rev*10+(x%10);
            x/=10;
        }
        return oriX==rev;
    }
}