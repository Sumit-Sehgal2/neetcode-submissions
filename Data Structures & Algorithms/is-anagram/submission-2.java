class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
       Map<Character,Integer>map=getfreq(s);
       Map<Character,Integer>map1=getfreq(t);
       if(map.equals(map1))
       {
        return true;
       }
       else
       {
        return false;
       }


    }

    public Map<Character,Integer>getfreq(String str)
    {
        Map<Character,Integer>map=new HashMap<>();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);


        }
        return map;
    }
}
