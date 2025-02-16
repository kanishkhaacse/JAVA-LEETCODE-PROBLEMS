import java.util.*;
class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
     PriorityQueue<Integer> a = new PriorityQueue<>();
      int m = matrix.length;
      for(int i=0;i<m;i++)
      {
        for(int j = 0;j<m;j++)
        {
         a.add(matrix[i][j]);
        }
      }
      int res =0;
    while(k>0)
    {
        res=a.poll();
        k--;
    }
    return res;
    }
}