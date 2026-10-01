class Solution {
    public void moveZeroes(int[] nums) {
        
        int k=0,i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
             nums[k]=nums[i];
             k++;
            }
        }
        for(i=k;i<nums.length;i++)
           nums[i]=0;
    }
}