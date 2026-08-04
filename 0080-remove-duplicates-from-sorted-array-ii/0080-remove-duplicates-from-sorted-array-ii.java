class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,c=1,count=1;
        while(j<nums.length)
        {
            if(nums[j]==nums[j-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=2)
            {
                i++;
                nums[i]=nums[j];
                c++;
            }
            j++;
          
        }
        return c;
        
    }
}