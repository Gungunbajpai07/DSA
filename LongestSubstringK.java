
class LongestSubstringK {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>(); //create map
        int low=0,high=0,distinct=0,maxlen=0,len=0;
        for(high=0;high<s.length();high++) //hogh ka loop chla
        {
            char ch=s.charAt(high); //high ko ans m include kro and yha pe answer hmara map h
            if(map.containsKey(ch)) //agr map m phle se wo character a to
            {
                map.put(ch,map.get(ch)+1);//uska freq 1 badh jayega
            }
            else { 
                distinct++; //ni to distinct ka count ++ hua aur 
                map.put(ch,1); //usko map m dale freq 1 kr di
            }
            
            while(distinct>k) //loop jb tk info glt h
            {
                char leftChar=s.charAt(low); //firing chalu
                map.put(leftChar,map.get(leftChar)-1);//map m uska freq 1 kam krdo
                if(map.get(leftChar)==0) // agr kam krne m chakkar m pura whi character is udd jay
                {
                    distinct--; //to distinct --
                    map.remove(leftChar); //map se hta do
                }
                low++; //low aage bado aur fir check kro ki usko htane k baad fir se kaam ho rha h kya agr ho ra h to fireeeee
            }
            if(distinct==k) // ab result m length ko add kro ki maxx length kon sa tha
            {
            len=high-low+1;
             maxlen=Math.max(maxlen,len);
                
            }
            
        }
        if(maxlen==0) //edge case handelling agr kuch aaya hi ni to -1 de diyo
        return -1;
        else
        return maxlen;
        
    } 
}