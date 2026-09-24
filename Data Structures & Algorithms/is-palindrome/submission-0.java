class Solution {
    private static boolean palindrome(String s)
    {
        int l = 0;
        int r = s.length()-1;

        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            return false;

            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for(char ch:s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                str+=ch;
            }
        }
        return palindrome(str);
    }
}
