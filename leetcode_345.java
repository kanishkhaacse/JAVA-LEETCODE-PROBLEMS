class Solution 
{
    public String reverseVowels(String s)
    {
        char[] a = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left =0;
        int right = s.length()-1;
        while(left<right)
        {
            if(!vowels.contains(String.valueOf(a[left])))
            {
                left++;
                continue;
            }
            if(!vowels.contains(String.valueOf(a[right])))
            {
                right--;
                continue;
            }
            char temp = a[left];
            a[left]= a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return new String(a);
    }
}