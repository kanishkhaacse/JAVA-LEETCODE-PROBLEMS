class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       ArrayList<Integer> a = new ArrayList<>();
       int i =0;
       int j=0;
       while(i<nums1.length && j<nums2.length)
       {
        if(nums1[i]==nums2[j])
        {
          a.add(nums1[i]);
          i++;
          j++;
       }
       else if(nums1[i]<nums2[j])
       {
        i++;
       }
       else
       {
        j++;
       }
       }
       int[] arr = new int[a.size()];
       int k =0;
       for(int num : a)
       {
          arr[k++] = num;
       }
       return arr;    
}
}