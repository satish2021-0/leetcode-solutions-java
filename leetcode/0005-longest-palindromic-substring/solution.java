class Solution {
    public String longestPalindrome(String s) {

        int start=0;
        int end=0;
        for(int i=0;i<s.length(); i++){
            
            //for odd length
           int l1= expandAroundCentre(s,i,i);
           //for even length
           int l2= expandAroundCentre(s,i,i+1);

           int len= Math.max(l1,l2); 

           if(len>end-start+1){
            start = i - (len - 1) / 2;
				end = i + len / 2;
           }     
     }
  return s.substring(start,end+1);
    }


    public int expandAroundCentre(String s, int left, int right) {

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;

    }
}
