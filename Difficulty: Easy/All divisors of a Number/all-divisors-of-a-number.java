class Solution {
    public static void print_divisors(int n) {
       ArrayList<Integer> result = new ArrayList<>();
       for(int i =1;i*i<=n;i++)
       {
           if(n%i==0)
           {
              result.add(i);
              System.out.print(i+" ");
           }
       }
       for(int j = result.size()-1;j>=0;j--)
          {
              if(n/result.get(j)!=result.get(j))
                 System.out.print(n/result.get(j)+" ");
          }
        
    }
}
