class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        
        int l = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> set = new HashMap<>();

        for(int r=0; r<s.length(); r++)
        {
            set.put(s.charAt(r),set.getOrDefault(s.charAt(r),0)+1);
            while(set.size()>2 && l<r)
            {
              set.put(s.charAt(l),set.get(s.charAt(l))-1);
              if(set.get(s.charAt(l))==0)
              {
                  set.remove(s.charAt(l));
              }
              l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}