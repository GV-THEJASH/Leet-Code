class Solution {
    public int gcdOfOddEvenSums(int n) {
        int s1=0;
        int s2=0;
        for(int i=1;i<=n*2;i+=2)
        {
            s1=s1+i;
        }
        for(int i=2;i<=n*2;i+=2)
        {
            s2=s2+i;
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1>=s2)
        {
            for(int i=(s2-1);i>=1;i--)
            {
                if(s2%i==0 && s1%i==0)
                return i;
            }
        }
        if(s1<s2)
        {
            for(int i=(s1-1);i>=1;i--)
            {
                if(s2%i==0 && s1%i==0)
                return i;
            }
        }
        return s1;
    }
}