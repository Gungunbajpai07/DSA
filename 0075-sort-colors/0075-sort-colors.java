class Solution {
    public void sortColors(int[] nums) {
        int i,c0=0,c1=0,l=nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]==0)
             c0++;
             else if(nums[i]==1)
             c1++;
             //else c2++; (not req.)
        }
        for(i=0;i<c0;i++)
        nums[i]=0;
        for(i=c0;i<(c0+c1);i++)
        nums[i]=1;
        for(i=(c0+c1);i<l;i++)
        nums[i]=2;
        
    }
}