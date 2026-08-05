class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,left,right,sum,res=0,diff;
        double max_diff = Double.POSITIVE_INFINITY;
        for(i=0;i<nums.length-2;i++)
        {
            left=i+1;
            right=nums.length-1;
            while(left<right)
            {
              sum=nums[i]+nums[left]+nums[right];
              diff=Math.abs(sum-target);
              if(diff<max_diff)
              {
                max_diff=diff;
                res=sum;
              }
             if(sum<target)
               left++;
             else if(sum>target)
               right--;
             else 
               return sum;
            }
        }
        return res;
    }
}