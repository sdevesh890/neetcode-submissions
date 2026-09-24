class Solution {
    private static String checkLcp(String res,String str)
    {
        int i=0;
        int j=0;
        String temp = "";
        while(i<res.length() && j<str.length())
        {
            if(res.charAt(i)!=str.charAt(j))
            break;

            temp+=res.charAt(i);
            i++;
            j++;
        }
        return temp;
    }
    public String longestCommonPrefix(String[] strs) {

        String res = strs[0]; 
        for(String str : strs)
        {
            res = checkLcp(res,str);
            if(res.equals("")) break;
        }
        return res;
    }
}