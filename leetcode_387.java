class Solution {
    public int firstUniqChar(String s) 
    {
      HashMap<Character,Integer> map = new HashMap<>();
      for(char a: s.toCharArray())
      {
        map.put(a,map.getOrDefault(a,0)+1);
      }  
      for(int i=0;i<s.length();i++)
      {
        if(map.get(s.charAt(i))==1)
        {
            return i;
        }
      }
      return -1;
    }
}
