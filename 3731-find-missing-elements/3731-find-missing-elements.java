class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int i,sm=nums[0],lr=nums[0],c=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>lr)
            lr=nums[i];
            else if(nums[i]<sm)
            sm=nums[i];
        }

        for(int j=sm;j<=lr;j++)
        {
            c=0;
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]==j)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            ans.add(j);
        }
       return ans;
        
    }
}