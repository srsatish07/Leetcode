class Solution {
    public boolean isPalindrome(int x) {
        int z=x;
		int y=0;
		while(x>0) {
			int temp=x%10;
			y=y*10+temp;
			x=x/10;
		}
        if(z==y){
            return true;
        }
        else{
            return false;
        }
    }
}