//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function Template for C++

class Solution {
  public:
    bool isDigitSumPalindrome(int n) {
        int x ;
        int sum =0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
            
        }
        x = sum;
        int rev =0;
        while(sum!=0)
        {
            rev=rev*10+sum%10;
            sum/=10;
            
        }
        return x==rev?true:false;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        bool res = ob.isDigitSumPalindrome(N);
        if (res)
            cout << "true"
                 << "\n";
        else
            cout << "false"
                 << "\n";

        cout << "~"
             << "\n";
    }
}

// } Driver Code Ends