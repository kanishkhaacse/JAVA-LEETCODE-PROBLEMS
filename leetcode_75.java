class Solution {
    public void sortColors(int[] nums) 
    {
        int z =0;
        int one =0;
        int two = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z++;
            }
            else if(nums[i]==1)
            {
                one++;
            }
            else if(nums[i]==2)
            {
                two++;
            }
        }
        int j=0;
        while(z>0)
        {
            nums[j]=0;
            j++;
            z--;
        }
        while(one>0)
        {
            nums[j]=1;
            j++;
            one--;
        }
        while(two>0)
        {
            nums[j]=2;
            j++;
            two--;
        }
    }
}