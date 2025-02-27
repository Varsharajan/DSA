//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

//User function Template for C++

class Solution{
	public:
   	long long int prime_Sum(int n){
        vector<bool> sieve(n+1,true);
        sieve[0]=sieve[1] = false;
        long long int sum =0;
        for(int i=2;i*i<=n;i++)
        {
            if(sieve[i])
            {
                
                for(int j=i*i;j<=n;j+=i)
                {
                    sieve[j]= false;
                }
            }
        }
      for(int i=2;i<=n;i++)
       {
           if(sieve[i])
           {
               sum+=i;
           }
       }
       return sum;
   	}    
};


//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution ob;
		long long int ans = ob.prime_Sum(n);
		cout << ans <<"\n";
	
cout << "~" << "\n";
}  
	return 0;
}
// } Driver Code Ends