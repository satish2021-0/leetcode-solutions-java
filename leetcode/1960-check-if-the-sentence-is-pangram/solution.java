class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] freq1=frequency(sentence);
        for(int i=0;i<26;i++){
            if(freq1[i]==0)
                return false;
        }
        return true;
    }
    public static int [] frequency(String s1){
        int [] freq =new int[26];
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            freq[c-97]++;
        }
        return freq;
    }
}
