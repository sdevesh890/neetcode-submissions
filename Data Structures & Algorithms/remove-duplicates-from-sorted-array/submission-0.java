class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int i = 1;
        
        for(int j=1; j<nums.length; j++)
        {
            if((!set.contains(nums[j]) && nums[j]!=nums[j-1]))
            {
                set.add(nums[j]);
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            
        }
        return i;
    }
}