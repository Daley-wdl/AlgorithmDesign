class Solution {
    public String convert(String s, int numRows) {
       
        char[] c=s.toCharArray();
		int len=s.length();
		
		if(len==0){
			return "";
		}
		if(numRows==1||len==numRows){
			return s;
		}
		
		StringBuffer[] sb=new StringBuffer[numRows];
		for(int i=0;i<numRows;i++) sb[i]=new StringBuffer();
		
		int rowNum = 0;
        // 向下读还是向上读的标志
        int flag = 1;
        for (int i = 0; i < len; i++) {
            if (rowNum == (numRows-1)){
                flag = -1;
            }
            if (rowNum == 0) {
                flag = 1;
            }
            sb[rowNum].append(c[i]);
            rowNum += flag;
        }
		
		for(int j=1;j<numRows;j++){
			sb[0].append(sb[j]);
		}
		return sb[0].toString();
    }
}
