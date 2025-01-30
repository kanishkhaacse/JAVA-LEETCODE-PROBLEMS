import java.util.*;
class Solution {
    public int findUnsortedSubarray(int[] nums) 
    {
        int[] cpy = new int[nums.length];
        int first=-1;
        int last = -1;
        System.arraycopy(nums,0,cpy,0,nums.length);
        Arrays.sort(cpy);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=cpy[i])
            {
                first=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
                if(nums[i]!=cpy[i])
                {
                    last = i;
                    break;
                }
        }
        if(first==-1)
        {
            return 0;
        }
        return (last-first)+1;
    }
}