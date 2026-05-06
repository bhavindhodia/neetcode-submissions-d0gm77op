class Solution {

    public String encode(List<String> strs) {
        StringBuffer res = new StringBuffer();
        for(String s:strs){
                res.append("~").append(s);  
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        return str.length() >0? List.of(str.substring(1).split("~",-1)) : List.of();
    }
}
