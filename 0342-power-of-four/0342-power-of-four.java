class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1||n==4)
        return true;
        if(n%4!=0)
        return false;
        int s=1;
        for(int i=0;i<n;i++)
        {
            s=s*4;
            if(s==n)
            return true;
        }
        return  false;
    }
}