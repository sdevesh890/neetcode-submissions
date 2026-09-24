class Solution {
    public int[] twoSum(int[] arr, int target) {

        int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            int difference = target - arr[i];
            if(map.containsKey(difference))
            {
                res[0] = map.get(difference);
                res[1] = i;
                break;
            }
            map.put(arr[i],i);
        }
        return res; 
    }
}
