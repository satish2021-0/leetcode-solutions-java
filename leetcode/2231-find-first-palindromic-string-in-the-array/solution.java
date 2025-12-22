class Solution {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {

            String word = words[i];   // current word
            String temp = "";         // reverse ke liye

            // reverse banayenge hum
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                temp = c + temp;
            }

            // palindrome check kr rhe hai hum yaha
            if (temp.equals(word)) {
                return word;
            }
        }

        return "";
    }
}

