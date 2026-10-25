class Solution {
    private static double pow(double x, long n)
    {
        if(n==0) return 1.0;
        if(n==1)
        {
            return x;
        }
        double sum = pow(x,n/2);
        if(n%2==0)
        {
            sum = sum * sum;
        }else{
            sum = sum * sum * x;
        }
        return sum;
    }
    public double myPow(double x, int n) {
        long longN = n; // Handle integer overflow for Integer.MIN_VALUE
        if (longN < 0) {
            return 1.0 / pow(x, -longN);
        }
        return pow(x, longN);
    }
}
