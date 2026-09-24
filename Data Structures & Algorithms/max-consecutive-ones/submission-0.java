class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int n:nums)
        {
            if(n==0)
            {
                max = Math.max(max,count);
                count=0;
            }else
            {
               count++; 
            }
        }
         max = Math.max(max,count);
        return max;
    }
}