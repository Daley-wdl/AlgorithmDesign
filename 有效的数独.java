class Solution {
    public boolean isValidSudoku(char[][] board) {
        
		boolean[] visited=new boolean[9];

		for(int i=0;i<9;i++){
			Arrays.fill(visited,false);
			for(int j=0;j<9;j++){
				if(!isValid(visited,board[i][j])){
					return false;
				}
			}
		}

		for(int i=0;i<9;i++){
			Arrays.fill(visited,false);
			for(int j=0;j<9;j++){
				if(!isValid(visited,board[j][i])){
					return false;
				}
			}
		}

		for(int i=0;i<9;i=i+3){
			for(int j=0;j<9;j=j+3){
				Arrays.fill(visited,false);
				for(int k=0;k<9;k++i){
					if(!isValid(visited,board[i+k/3][j+k%3])){
						return false;	
					}
				}
			}
		}

		return true;

    }

	public boolean isValid(boolean[] visited, char ch){
		
		if(ch == '.'){
			return true;
		}

		int num = ch - '0';

		if(num<0 || num>9 || visited[num-1]){
			return false;
		}
		visited[num-1]=true;
		return true;
	}
}