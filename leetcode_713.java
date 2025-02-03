class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        if(k<=1)return 0;
       int count = 0;
       int pro = 1;
       int left = 0;
       int right = 0;
       while(right<nums.length)
       {
           
         pro*=nums[right];
         while(pro>=k)
         {
             pro /=nums[left];
             left++;
         }
         count+=1+(right-left);
         right++;
       }
     return count;
    }
}