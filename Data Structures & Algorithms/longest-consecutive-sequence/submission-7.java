class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet();
        for(int i : nums){
            s.add(i);
        }
        int longest = 0;
        for(int i:s){
            if(!s.contains(i-1)){
                int currentNum=i;
                int streak=1;
                while(s.contains(currentNum+1)){
                    currentNum++;
                    streak++;
                }
                longest = Math.max(longest,streak);
            }
        }

        return longest;
    }
}
