//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends

//User function Template for C++
class Solution
{
public:
    vector<int> sieveOfEratosthenes(int N)
    {
        vector<bool> sieve(N+1,true);
        vector<int> prime;
        sieve[0]=sieve[1]=0;
        for(int i=2;i<=N;i++)
        {
            if(sieve[i])
            {
                prime.push_back(i);
                for(int j=2*i;j<=N;j+=i)
                {
                    sieve[j]=false;
                }
            }
        }
        return prime;
    }
};


//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
        Solution ob;
        vector<int> primes  = ob.sieveOfEratosthenes(N);
        for(auto prime : primes) {
            cout<< prime <<" ";
        }
        cout<<endl;
    
cout << "~" << "\n";
}
    return 0;
}
// } Driver Code Ends