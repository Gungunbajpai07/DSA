class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1,s=0;
        while(i<j)
        {
            s=numbers[i]+numbers[j];
            if(s==target)
            {
                return new int[]{i+1,j+1};
            }
            else if(s>target)
               j--;
            else i++;
        }
        return new int[]{};
        
    }
}