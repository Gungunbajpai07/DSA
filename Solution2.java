class Solution2 {
    void segregate0and1(int[] arr) {
        // code here
     int c0=0,l=arr.length,i;
     for(i=0;i<l;i++)
     {
         if(arr[i]==0)
          c0++;
         /* else   (no need of c1 actually)
          c1++;*/
     }
     for(i=0;i<c0;i++)
      arr[i]=0;
     for(i=c0;i<l;i++)
       arr[i]=1;
        
    }
}