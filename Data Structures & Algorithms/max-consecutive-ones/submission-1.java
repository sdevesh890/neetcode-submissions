class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int n:nums)
        {
            count = n==1?count+1 : 0;
            max = Math.max(max,count);
        }
        return max;
    }
}