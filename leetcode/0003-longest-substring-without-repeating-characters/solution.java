class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int maxLength=0;
        Set<Character> set1 = new HashSet<>();

        for(int right=0; right<s.length();right++){
            char ch = s.charAt(right);

            while(set1.contains(ch)){
                set1.remove(s.charAt(left));
                left++;
            }
            set1.add(ch);
            maxLength= Math.max(maxLength, right-left+1);
        }

    return maxLength;
    }
}
