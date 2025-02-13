class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
      int n = s.length();
      int max = 0;
      Set<Character> c = new HashSet<>();
      int left = 0;
      for(int right = 0;right<n;right++)
      {
        if(!c.contains(s.charAt(right)))
        {
            c.add(s.charAt(right));
            max = Math.max(max , right-left+1);
        }
        else
        {
            while(c.contains(s.charAt(right)))
            {
                c.remove(s.charAt(left));
                left++;
            }
            c.add(s.charAt(right));
        }
      }
      return max;   
    }
}