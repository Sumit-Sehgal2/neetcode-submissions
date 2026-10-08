class Solution {
    public int maxArea(int[] heights) {

        int start=0;
        int end=heights.length-1;
        int height=Integer.MAX_VALUE;
        int result=0;


        while(start<end)
        {
            int width=end-start;
             height=Math.min(heights[start],heights[end]);
             int area=width*height;
             if(result<area)
             {
                result=area;
             }
             if(heights[start]>heights[end])
             {
                end--;

             }
             else
             {
                start++;
             }
        }
        return result;
        
    }
}
