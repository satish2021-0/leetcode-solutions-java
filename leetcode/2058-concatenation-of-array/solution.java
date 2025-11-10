class Solution {
    public int[] getConcatenation(int[] nums) {
        // here I'm building a new array which has size is double of nums that is... 2*n
        int n = nums.length;
        int [] ans= new int[2*n];

        for(int i=0;i<ans.length;i++){
             ans[i] = nums[i % n];
        } 
    return ans;
    }
}
