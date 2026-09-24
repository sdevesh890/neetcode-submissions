class Solution {
    private static boolean checkpalindrome(String s, int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
         
         int l = 0;
         int r = s.length()-1;

         while(l<r)
         {
            if(s.charAt(l)!=s.charAt(r))
            {
                boolean b1 = checkpalindrome(s,l+1,r);
                boolean b2 = checkpalindrome(s,l,r-1);
                if(b1 || b2)
                {
                    return true;
                }else
                {
                    return false;
                }
            }
            l++;
            r--;
         }
         return true;
    }
}