class Solution {
    public int totalFruit(int[] nums) {
     int N = nums.length;
     int ans=0;
     Map<Integer,Integer>f=new HashMap<>();
     for(int r=0,l=0;r<N;r++)
     {
        f.put(nums[r],f.getOrDefault(nums[r],0)+1);
        while(f.size()>2)
        {
            f.put(nums[l],f.getOrDefault(nums[l],0)-1);
            if(f.get(nums[l])==0)
            {
                f.remove(nums[l]);
            }
            l++;
        }
        ans=Math.max(ans,r-l+1);
     } 
     return ans;  
    }
}