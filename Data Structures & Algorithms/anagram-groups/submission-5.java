class Solution {
    private String getHash(String s1){
        int [] hash = new int[26];
        for(int i =0; i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int x : hash){
            sb.append(x).append('#');
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,ArrayList<String>> m = new HashMap();
        for(String s:strs){
           String hashKey = getHash(s);
           if(m.containsKey(hashKey)){
            ArrayList<String> temp = m.get(hashKey);
            temp.add(s);
            m.put(hashKey,temp);
           }
           else{
            ArrayList<String> newArr = new ArrayList(List.of(s));
            m.put(hashKey,newArr);
           }
        }
        return new ArrayList<>(m.values());
    }
}
