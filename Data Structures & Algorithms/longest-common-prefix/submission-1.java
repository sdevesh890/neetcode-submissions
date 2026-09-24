class Solution {

    private static String findPrefix(String prefix,String str)
    {
        String res = "";
        int i = 0;
        int j = 0;
        while(i<prefix.length() && j<str.length())
        {
            if(prefix.charAt(i)!=str.charAt(j))
            break;

            res+=prefix.charAt(i);

            i++;
            j++;
        }
        return res;
    }
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(String str:strs)
            prefix = findPrefix(prefix,str);

        return prefix;
    }
}