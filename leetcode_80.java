class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length<=2) return nums.length;
        int start = 2;
        for(int end=2;end<nums.length;end++)
        {
            if(nums[end]!=nums[start-2])
            {
                nums[start] = nums[end];
                start++;
            } 
        }
        return start;
    }
}