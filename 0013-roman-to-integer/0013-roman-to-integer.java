class Solution {
    public int romanToInt(String s) {

        int num=0;
        int i=0;

        while(i < s.length()){

            if(s.charAt(i)=='M'){
                num=num+1000;
            }
            else if(s.charAt(i)=='D'){
                num=num+500;
            }
            else if(s.charAt(i)=='C' && i+1 <s.length() && s.charAt(i+1)=='M'){
                num=num-100;
            }
            else if(s.charAt(i)=='C' && i+1 <s.length() && s.charAt(i+1)=='D'){
                num=num-100;
            }
            else if(s.charAt(i)=='C'){
                num=num+100;
            }
            else if(s.charAt(i)=='L'){
                num=num+50;
            }
             else if(s.charAt(i)=='X' && i+1 <s.length() && s.charAt(i+1)=='C'){
                num=num-10;
            }
             else if(s.charAt(i)=='X' && i+1 <s.length() && s.charAt(i+1)=='L' ){
                num=num-10;
            }
            else if(s.charAt(i)=='X'){
                num=num+10;
            }
            else if(s.charAt(i)=='V'){
                num=num+5;
            }
            else if(s.charAt(i)=='I' && i+1<s.length() && s.charAt(i+1)=='V'){
                num=num-1;
            }
            else if(s.charAt(i)=='I' && i+1 <s.length() && s.charAt(i+1)=='X'){
                num=num-1;
            }
            else if(s.charAt(i)=='I'){
                num=num+1;
            }
            i++;
        }
        return num;
        
    }

}