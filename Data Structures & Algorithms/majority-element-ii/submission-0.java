class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int appear = nums.length/3;
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Integer key:map.keySet())
        {   
            if(map.get(key)>appear)
            list.add(key);
        }
        return list;
    }
}