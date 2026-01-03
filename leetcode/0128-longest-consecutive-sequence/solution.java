class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> h1 = new HashSet<>();
        for(int x:nums){
            h1.add(x);
        }
         int longest = 0;

        for (int x : h1) {

            if (!h1.contains(x - 1)) {

                int currentNum = x;
                int count = 1;
 
                while (h1.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
