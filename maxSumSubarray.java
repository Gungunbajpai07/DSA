class maxSumSubarray {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i,maxSum=0,s=0,low=0,high=k;
        for(i=0;i<k;i++)
        s=s+arr[i];
        maxSum=s;
        while(high<arr.length)
        {
          s=s-arr[low];
          s=s+arr[high];
          low++;
          high++;
          maxSum=Math.max(maxSum,s);
        }
        return maxSum;
    }
}