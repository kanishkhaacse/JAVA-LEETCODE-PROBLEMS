class Solution {
    public boolean isPalindrome(int x) 
    {
        String s1 = Integer.toString(x);
        StringBuilder s2 = new StringBuilder(s1);
        s2.reverse();
        if(s1.equals(s2.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}