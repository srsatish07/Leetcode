class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        boolean neg=false;

		int sd=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);

            if(i==0){
                if(ch=='-'){
                    neg=true;
                    continue;
                }
                else if(ch=='+'){
                    neg=false;
                    continue;
                }
            }

			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int sdd=ch-'0';

                if(neg){
                    int check=-sd;
                    if(check < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                }
                else{
                    if(sd >Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                }

				sd=sd*10+sdd;
                
			}
			else {
				break;
			}
		}
        if(neg){
            sd=-sd;
        }
        return sd;
    }
}