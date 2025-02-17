class Solution {
    public int reverse(int x) {

        long y=0;
		int rem=0;
		boolean isnegative=x < 0;
		x=Math.abs(x);
		System.out.println(x);
		while(x>0) {
			rem=x%10;
			
			y=(y*10)+rem;
			x=x/10;
		}
		
		if(y>Integer.MAX_VALUE) {
				return 0;
			}
		return(int) (isnegative ? -y:y);
		
        
    }
}