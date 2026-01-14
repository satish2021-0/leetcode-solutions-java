class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String p = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                p = p + c;
            }
        }

        String q = "";
        for (int i = 0; i<p.length(); i++) {
            char z = p.charAt(i);
            q = z + q;
        }
        if (p.equals(q))
            return true;
        return false;
    }
}
