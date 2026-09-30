class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = "";
        for(int i=ss.length()-1;i>=0;i--){
            rev+=ss.charAt(i);
            System.out.println("STR - "+rev);
        }
        return ss.equals(rev);
    }
}
