class Solution {
    public int minimumRecolors(String blocks, int k) {
         int l = 0;
         int w = 0;

         for(int i=0; i<k; i++)
         {
            if(blocks.charAt(i)=='W') w++;
         }
         int min = w;

         for(int i=k; i<blocks.length(); i++)
         {
            if(blocks.charAt(l)=='W')
            {
                w--;
            }
            if(blocks.charAt(i)=='W') w++;

            min = Math.min(min,w);
            l++;
         }

         return min;
    }
}