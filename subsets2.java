class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
		Arrays.sort(nums);
		backtrack(result,list,nums,0);
		return result;
    }
	public void backtrack(List<List<Integer>> result, List list, int[] nums, int start){
		
		result.add(new ArrayList<>(list));
		for(int i=start;i<nums.length;i++){
			if(i>start&&nums[i]==nums[i-1]) continue;
			list.add(nums[i]);
			backtrack(result,list,nums,i+1);
			list.remove(list.size()-1);
		}
	}
}