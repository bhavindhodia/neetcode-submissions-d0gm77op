class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> numberMap = new HashSet<Integer>();
      for(int i :nums){
        if(numberMap.contains(i)){
            return true;
        }
        numberMap.add(i);
      }
    return false;
    }
}