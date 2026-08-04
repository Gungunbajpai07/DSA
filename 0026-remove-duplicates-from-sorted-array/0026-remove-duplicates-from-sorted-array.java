class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,c=1;
        while(j<nums.length)
        {
            if(nums[j]==nums[j-1])
            {
                j++;
                continue;
            }
            else
            {
                nums[i+1]=nums[j];
                j++;
                c++;
                i++;
            }
        }
        return c;
        
    }
}