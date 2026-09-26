class Solution {
    public int majorityElement(int[] nums) {
          HashMap<Integer,Integer> map = new HashMap<>();

          for(int n:nums)
          {
             map.put(n,map.getOrDefault(n, 0)+1);
          }
          
          int max = Integer.MIN_VALUE;  
          for(Integer key:map.keySet())
          {
              Integer val = map.get(key);
              if(val>nums.length/2)
              {
                  max = key;
                  break;
              }
          }
          return max;
    }
}