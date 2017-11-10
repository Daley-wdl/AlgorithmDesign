class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] temp=new int[2];
        for(int i=0;i<nums.length-1;i++){
            
            temp[i]=nums[i];
            for(int j=i+1;j<nums.length;j++){
                
                if((nums[i]+nums[j])==target){
                    
                    temp[0]=nums[i];
                    temp[1]=nums[j];
                }
                   
            }
        }
        return temp;
    }
}
