class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> nmap = new HashMap();
        for(int i :nums){
            nmap.merge(i,1,Integer::sum);
        }
        //System.out.println("MAP: "+nmap.tailMap(2).keySet());
    Map<Integer,Integer> resMap =nmap.entrySet().stream()
   .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
   .limit(k)
   .collect(Collectors.toMap(
          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
          
        int[] res = new int[resMap.size()];
        int index=0;
        for(Integer i : resMap.keySet()){
            res[index++]=i;
        }
        return res;
    }
}
