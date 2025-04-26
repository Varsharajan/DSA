class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[] nums,int start,int end)
    {
        if(start>=end)
          return;
        int mid = start+(end-start)/2;
         mergeSort(nums,start,mid);
         mergeSort(nums,mid+1,end);
         merge(nums,start,mid,end);
    }
    void merge(int nums[],int l,int mid,int r)
    {
        int[] result = new int[r-l+1];
        int i =l, j= mid+1, k=0;
        while(i<=mid && j<=r)
        {
            if(nums[i]<=nums[j])
               result[k++] = nums[i++];
             else
               result[k++] = nums[j++];
        }
        while(i<=mid)
           result[k++] = nums[i++];
        while(j<=r)
           result[k++] = nums[j++];
           
        for(i=0;i<k;i++)
        {
            nums[l+i] = result[i];
        }
    }
}