class Solution {
    public void sort(int[] sourceArray) {
        

		for(int i=0;i<sourceArray.length;i++){
			
			boolean flag=true;
			for(int j=0;j<j-i;j++){
				
				if(sourceArray[j]>sourceArray[j+1]){
					int temp=sourceArray[j];
					sourceArray[j]=sourceArray[j+1];
					sourceArray[j+1]=sourceArray[j];
					flag=false;
				}
			}
			if(flag){
				break;
			}
		}
    }
}