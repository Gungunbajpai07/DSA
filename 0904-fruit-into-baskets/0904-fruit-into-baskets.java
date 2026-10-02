class Solution {
    public int totalFruit(int[] fruits) 
    {

     HashMap<Integer,Integer>map=new HashMap<>(); //create map

        int low=0,high=0,distinct=0,maxlen=0,len=0;

         for(high=0;high<fruits.length;high++) //hogh ka loop chla
         {
            int f=fruits[high]; //high ko ans m include kro and yha pe answer hmara map h
            if(map.containsKey(f)) //agr map m phle se wo character a to
            {
                map.put(f,map.get(f)+1);//uska freq 1 badh jayega
            }
            else
            { 
                distinct++; //ni to distinct ka count ++ hua aur 
                map.put(f,1); //usko map m dale freq 1 kr di
            }
            
            while(distinct>2) //loop jb tk info glt h
            {
                int leftfruit=fruits[low]; //firing chalu
                map.put(leftfruit,map.get(leftfruit)-1);//map m uska freq 1 kam krdo
                if(map.get(leftfruit)==0) // agr kam krne m chakkar m pura whi character is udd jay
                {
                    distinct--; //to distinct --
                    map.remove(leftfruit); //map se hta do
                }
                low++; //low aage bado aur fir check kro ki usko htane k baad fir se kaam ho rha h kya agr ho ra h to fireeeee
            }
             // ab result m length ko add kro ki maxx length kon sa tha
            len=high-low+1;
             maxlen=Math.max(maxlen,len);     
        }
        if(maxlen==0) //edge case handelling agr kuch aaya hi ni to -1 de diyo
        return -1;
        else
        return maxlen;     
    }
}
