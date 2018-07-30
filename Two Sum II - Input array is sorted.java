class Solution {
    public int[] twoSum(int[] numbers, int target) {

		int[] index=new int[2];

		int i=0,j=numbers.length-1, sum;

		while(i<j){
			sum=numbers[i]+numbers[j];
			if(sum==target){
				index[0]=++i;
				index[1]=++j;
                break;
			}else if(sum>target){
				j--;
			}else{
				i++;
			}
		}

		return index;
    }
}