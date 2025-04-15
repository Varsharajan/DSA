//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    bool isPrime(int n) {
        if(n==1)
          return false;
          int count =0;
         for(int i =1;i*i<=n;i++)
         {
             if(n%i==0)
               count++;
               
         }
         if(count==1)
           return true;
          else
           return false;
        
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
        cout << (ob.isPrime(N) ? "true" : "false") << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends