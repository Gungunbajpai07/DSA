class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i,j;
        i=0;j=arr.length-1; //mistake 1 of j=arr.length
        int temp;
        
            while(i<j)
            {
               while(i<j&&arr[j]==1)// last no is 1 only so move ahead until u get a 0
              j--;
            while(i<j&&arr[i]==0)
               i++;
               
            if(i<j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            
            }
            
            }
        
    }
}