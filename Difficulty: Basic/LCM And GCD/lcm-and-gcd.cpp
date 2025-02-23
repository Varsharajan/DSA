//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    vector<int> lcmAndGcd(int a, int b) {
        int a_ori =a;
        int b_ori =b;
        while(a>0 && b>0)
        {
         if(a>b)
            a= a%b;
         else
           b = b%a;
        }
        
        int gcd = a==0?b:a;
          int lcm = (a_ori*b_ori)/gcd;
         return{lcm,gcd};
           
    }
};
//Tc-O(log(min(a,b))) SC= O(1)

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        int A, B;

        cin >> A >> B;

        Solution ob;
        vector<int> ans = ob.lcmAndGcd(A, B);
        cout << ans[0] << " " << ans[1] << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends