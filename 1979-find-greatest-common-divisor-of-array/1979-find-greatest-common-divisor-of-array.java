class Solution {
    public int findGCD(int[] nums) {

        int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if(max < nums[i]) {
				max=nums[i];
			}
			if (min > nums[i]) {
				min=nums[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		int a=max, b=min;
		
		while(b != 0) {
			int temp=b;
			b=a%b;
			a=temp;
		}

        return a;
        
    }
}