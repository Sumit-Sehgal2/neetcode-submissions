class Solution {
    public int lengthOfLongestSubstring(String s) {
       

        int left=0;
        int max=0;
        Set<Character>set=new HashSet<>();
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            while(set.contains(arr[i]))
            {
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[i]);
            max=Math.max(max,set.size());
        }
        return max;
        
    }
}
