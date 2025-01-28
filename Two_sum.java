class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int s = -1;
        int t = -1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    s=i;
                    t=j;
                } 
            }
        }
       return new int[] {s,t};
    }
}