class Solution {
    public int maxArea(int[] height) {

        int result=0;
		int li=0;
		int ri=height.length-1;
		
		while(li<ri) {
			
			int left=height[li];
			int right=height[ri];
			
			int area=Math.min(left, right)*(ri-li);
			result=Math.max(result, area);
			
			if(left<right) {
				li++;
			}
			else {
				ri--;
			}
		}
        return result;
        
    }
}