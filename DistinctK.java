class DistinctK {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        int low=0,high=0,distinct=0,maxlen=0,len=0;
        for(high=0;high<s.length();high++)
        {
            char ch=s.charAt(high);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else { 
                distinct++;
                map.put(ch,1);
            }
            
            while(distinct>k)
            {
                char leftChar=s.charAt(low);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0)
                {
                    distinct--;
                    map.remove(leftChar);
                }
                low++;
            }
            if(distinct==k)
            {
            len=high-low+1;
             maxlen=Math.max(maxlen,len);}
            
        }
        if(maxlen==0) 
        return -1;
        else
        return maxlen;
        
    } 
}