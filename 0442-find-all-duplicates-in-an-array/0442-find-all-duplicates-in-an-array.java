class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>l=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==nums[i+1])
            {
                l.add(nums[i]);
                i++;
            }
        }
        return l;
    }
}