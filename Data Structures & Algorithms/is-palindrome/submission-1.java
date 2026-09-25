class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(char ch:s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
        }

        return palindrome(sb.toString());
    }
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
}
