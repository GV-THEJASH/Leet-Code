class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int m=nums[0];
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>m)
            {
                m=nums[i];
                x=i;
            }
        }
        return x;
    }
}