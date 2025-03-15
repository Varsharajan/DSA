class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat =0;
        int i =0, r = people.length-1;
        while(i<=r)
        {
            if(people[i]+people[r]<=limit)
               {
                boat++;
                i++;
                r--;
               }
            else
            {
                boat++;
                r--;
            }
        }
        return boat;
    }
}