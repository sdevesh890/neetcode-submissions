class Solution {
    public void sortColors(int[] nums) {
         int zero = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0) zero++;
            else if(nums[i]==1) ones++;
            else twos++;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(zero>0)
            {
                nums[i] = 0;
                zero--;
            }else if(ones>0)
            {
                nums[i] = 1;
                ones--;
            }else {
                nums[i] = 2;
                twos--;
            }
        }
    }
}