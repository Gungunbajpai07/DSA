class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int res[]=new int[m+n];
        int i=0,j=0,ind=0;
        //using 2 pointers
        while(i<m&&j<n)
        {
            if(nums1[i]<=nums2[j])
            {
            res[ind]=nums1[i];
            ind++;
            i++;
            }
            else 
            {
                res[ind]=nums2[j];
                ind++;
                j++;
            }
        }
            //edge case handellling
            while(i<m)
            {
                res[ind]=nums1[i];
                ind++;
                i++;
            }
            while(j<n)
            {
                res[ind]=nums2[j];
                ind++;
                j++;
            }

        //copying ans in the existing array as requested by leetcode
        for(i=0;i<m+n;i++)
        nums1[i]=res[i];
        //return new nums1[]; (NOT REQUIRED RETURN TYPE IS VOID)
    }
}