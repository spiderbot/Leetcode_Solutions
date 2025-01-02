public class Leetcode79_WordSearch {

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean finalValue = exist(board,"ABCCED");
        System.out.println("finalValue->" + finalValue);
    }


        public static boolean exist(char[][] board, String word) {
//        System.out.println
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    boolean[][] visited = new boolean[board.length][board[0].length];
                    if(dfs(board,visited,word,0,i,j)){
                        return true;
                    }
                }
            }
            return false;
        }

        private static boolean dfs(char[][] board, boolean[][] visited, String originalString, int stringIndex,int i, int j){
            // base case --> when we have reached the end of string
            System.out.println("i->" + i);
            System.out.println("j->" + j);
            System.out.println("stringIndex-> " + stringIndex);
            if(stringIndex >= originalString.length()){
                return false;
            }
            if( i >= board.length || j >= board[0].length){
                return false;
            }
            if( i < 0 || j < 0){
                return false;
            }
            if(visited[i][j] == false && stringIndex == originalString.length()-1 && board[i][j] == originalString.charAt(stringIndex)){
                return true;
            }
            if(originalString.charAt(stringIndex) == board[i][j]){
                visited[i][j] = true;
                if(i <= board.length-1 && j <= board[0].length - 1){
                    boolean one = dfs(board,visited,originalString,stringIndex+1,i,j+1);
                    boolean two = dfs(board,visited,originalString,stringIndex+1,i,j-1);
                    boolean three = dfs(board,visited,originalString,stringIndex+1,i+1,j);
                    boolean four = dfs(board,visited,originalString,stringIndex+1,i-1,j);

                    return one || two || three || four;
                }
            }
            return false;
        }
    }


