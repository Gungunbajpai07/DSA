class TripletCloserSum {
    int countTriplets(int sum, int arr[]) {
        // code here
        int i=0,s=0,count=0;
        Arrays.sort(arr);
        for(i=0;i<arr.length-2;i++)
        {
             int left=i+1,right=arr.length-1;
          while(left<right)
           {
            s=arr[i]+arr[left]+arr[right];
            if(s<sum)
            {
                count=count+(right-left);
                left++;
            }
            else
               right--;
            }
        }
        return count;
        
    }
}