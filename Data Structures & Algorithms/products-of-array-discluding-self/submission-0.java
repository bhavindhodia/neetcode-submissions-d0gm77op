class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        Map<Integer,Integer> result = new HashMap();
        for(int i =0; i<nums.length;i++){
                int c = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    c*=nums[j];
                }
            }
            res[i]=c;
                System.out.println(res[i]);
        }

        return res;
    }
}  
