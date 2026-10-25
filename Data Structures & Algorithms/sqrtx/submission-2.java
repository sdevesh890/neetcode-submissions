class Solution {

    private static int sqrt(long low,long high,long target)
    {
        while(low<=high)
        {
            long mid = low+(high-low)/2;

            if(mid * mid<=target)
            {
                low = mid+1;
            }else
            {
                high = mid-1;
            }
        }
        return (int) high;
    }
    public int mySqrt(int x) {
        long n = x;
        if(n==0) return 0;
        if(n<=2)
        return 1;
        return sqrt(1,n/2,n); 
    }
}