class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int N=nums.length;
        int ans=N+1;
        int s=0;
        for(int r=0,l=0;r<N;r++)
        {
            s+=nums[r];
            while(s>=target)
            {
                ans=Math.min(ans,r-l+1);
                s-=nums[l];
                l++;
            }
        }
        if(ans==N+1) ans=0;
        return ans;
    }
}