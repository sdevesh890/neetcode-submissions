class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int [n];
        int suffix[] = new int[n];

        int sum = 1;
        for(int i=0; i<n; i++)
        {
            sum*=nums[i];
            prefix[i] = sum;
        }

        sum = 1;

        for(int i=n-1; i>=0; i--)
        {
            sum*=nums[i];
            suffix[i] = sum;
        }

        for(int i=0; i<n; i++)
        {
            if(i==0)
            {
                nums[i] = suffix[i+1];
            }else if(i==n-1)
            {
                nums[i] = prefix[i-1];
            }else {
                nums[i] = prefix[i-1] * suffix[i+1];
            }
        }

        return nums;
    }
}  
