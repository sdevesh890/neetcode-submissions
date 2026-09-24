class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i=1; i<s.length(); i++)
        {
            int e1 = s.charAt(i);
            int e2 = s.charAt(i-1);
            sum+=Math.abs(e1-e2);
        }
        return sum;
    }
}