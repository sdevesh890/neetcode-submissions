class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n:nums)
            set.add(n);
        
        int len = 1;
        int max = 0;

        for(Integer n:set)
        {
            if(!set.contains(n-1))
            {   
                while(set.contains(n+len))
                {
                    len++;
                }
                max = Math.max(max,len);
                len=1;
            }
        }

        return max;
        
      
    }
}
