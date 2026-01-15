class Solution {
    public boolean isPalindrome(String s) {
        
    s= s.toLowerCase().trim();

    String p ="";
    for(int i=0; i<s.length();i++){
        char c = s.charAt(i);
        if((c>='a' && c<='z') || (c>='0' && c<='9')){
            p=p+c;
        }
    }

    String q="";
    for(int j=0;j<p.length();j++){
         char x = p.charAt(j);
         q=x+q;
    }

    if(p.equals(q))
        return true;
    return false;
    }
}
