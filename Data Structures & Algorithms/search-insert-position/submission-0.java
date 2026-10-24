class Solution {
    private static int search(int nums[],int low,int high,int target)
    {
        while(low<=high)
        {
            int mid = low+(high-low)/2;

            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid]>target)
            {
                high = mid-1;
            }else
            {
                low = mid+ 1;
            }
        }
        return low;
    }
    public int searchInsert(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);
    }
}