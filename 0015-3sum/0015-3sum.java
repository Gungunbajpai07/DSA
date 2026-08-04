class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        int i,left,right,sum,s;
        for(i=0;i<nums.length-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            continue;
            left=i+1;
            right=nums.length-1;
            sum=-1*nums[i];

            while(left<right)
            {
                s=nums[left]+nums[right];
                if(s==sum)
                {
                  //return new[]{nums[left],nums[right],nums[i]};
                  res.add( Arrays.asList(nums[i],nums[left],nums[right]));
                  left++;
                  right--; 
                  //skip duplicates 
                  while(left<nums.length&&nums[left]==nums[left-1])
                  left++;
                  while(right>=0&&nums[right]==nums[right+1])
                  right--;    
                }
              else if(s<sum)
              left++;
              else
              right--;
            }
        }
        return res;
            
    }
}