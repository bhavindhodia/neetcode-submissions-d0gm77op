class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];
                if(num=='.'){
                    continue;
                }
                String rowKey = num+"-row-"+i;
                String colKey = num+"-col-"+j;
                String cubeKey = num+"cube"+(i/3)+"-"+(j/3);
                if(!seen.add(rowKey) || !seen.add(colKey) || !seen.add(cubeKey)){
                    return false;
                }
            }
        }
        return true;
    }
}
