class Solution {
    public int[] sortedSquares(int[] nums) {
        
         int res[] = new int[nums.length];
         int l = 0,r=nums.length-1;
         int resInd = nums.length-1;

         while(l<=r)
         {
            if(Math.abs(nums[l])>Math.abs(nums[r]))
            {
                res[resInd] = nums[l]*nums[l];
                l++;
            }else
            {
                res[resInd] = nums[r]*nums[r];
                r--;
            }
            resInd--;
         }
         return res;
    }
}