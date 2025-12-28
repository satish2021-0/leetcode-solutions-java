class Solution {
    public boolean isAnagram(String s, String t) {
        int [] Freq1= getFreq(s);
        int [] Freq2 = getFreq(t);

        for(int i=0; i<26;i++){
            if(Freq1[i]!=Freq2[i])
                return false;
        }

        return true;
    }

   public static int [] getFreq(String s){
    int [] f1 = new int[26];
    for(int i =0; i<s.length();i++){
        char c = s.charAt(i);
        f1[c-97]++;
    }
    return f1;
   }
}
