class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,h=0,s=0;
        int res=Integer.MAX_VALUE;
        while(h<nums.length)
        {
            s=s+nums[h];
            while(s>=target)
            {
                int len=(h-l)+1;
                res=Math.min(res,len);
                s=s-nums[l];
                l++;
            }
            h++;
        }
        if(res==Integer.MAX_VALUE)
        return 0;
        else
        return res;    
    }
}