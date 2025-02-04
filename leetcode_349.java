class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        int l1 =  nums1.length;
        int l2 =  nums2.length;
       Set<Integer> set= new HashSet<>(); 
       Set<Integer> resultSet= new HashSet<>(); 
       for(int i=0;i<l1;i++)
       {
           set.add(nums1[i]);
       }
       for(int i=0;i<l2;i++)
       {
        if(set.contains(nums2[i]))
        {
            resultSet.add(nums2[i]);
        }
       }
       int[] arr = new int[resultSet.size()];
       int k = 0;
       for(int num:resultSet)
       {
          arr[k++] = num;
       }
       return arr;
    }
}