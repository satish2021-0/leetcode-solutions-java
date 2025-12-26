class Solution {
    public boolean isAnagram(String s, String t) {

         int [] freq1 = Freq(s);
         int [] freq2 = Freq(t);

         for(int i =0;i<26;i++){
            if(freq1[i]!=freq2[i])
                    return false;
         }
        return true;
    }

    public static int [] Freq(String s){
        int [] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-97]++;
        }
        return freq;
    }

    }
