import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        ArrayList<String> a = new ArrayList<>();
        if(nums.length==0) return a;
        int start = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!= nums[i-1]+1)
            {
                if(start == nums[i-1])
                {
                    a.add(String.valueOf(start));
                }
                else
                {
                    a.add(String.valueOf(start + "->"+nums[i-1]));
                }
               start = nums[i];
            }
        }
        if(start == nums[nums.length-1])
        {
            a.add(String.valueOf(start));
        }
        else
        {
            a.add(String.valueOf(start + "->" + nums[nums.length-1]));
        }
        return a;
    }
}