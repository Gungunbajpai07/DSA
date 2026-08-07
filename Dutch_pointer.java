class Dutch_pointer {
    public void sortColors(int[] nums) {
        int i,start=0,end=nums.length-1,mid=0,t=0;
        while(mid<=end)
        {
            if(nums[mid]==0)
            {
                t=nums[start];
                nums[start]=nums[mid];
                nums[mid]=t;
                mid++;
                start++;
            }
            else
            if(nums[mid]==1)
            mid++;
            else if(nums[mid]==2)
            {
                t=nums[mid];
                nums[mid]=nums[end];
                nums[end]=t;
                end--;
            }


        }
        
    }
}