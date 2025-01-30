class Solution {
    public int pivotInteger(int n) 
    {
        int sum1=0;
        int total =  n*(n+1)/2;
        int leftsum =0;
        if(n==1) return 1;
        for(int i=0;i<n;i++)
        {
            leftsum = i*(i+1)/2;
            if(leftsum== total - leftsum+i)
            {
                return i;
            }
        }
        return -1;
    }

}