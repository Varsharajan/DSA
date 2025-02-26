//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    void print_divisors(int n) {
        vector<int> result;
        for(int i=1;i*i<=n;i++)
         {
             if(n%i==0)
             {
                 result.push_back(i);
                 cout<<i<<" ";
             }
               
         }
         int x = result.size()-1;
         for(int i = x;i>=0;i--)
         {
             if(result[i]==(n/result[i]))
                continue;
              cout<<n/result[i]<<" ";
         }
         
    }
};


//{ Driver Code Starts.
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        Solution ob;
        ob.print_divisors(n);
        cout << endl;
    
cout << "~" << "\n";
}
    return 0;
}
// } Driver Code Ends