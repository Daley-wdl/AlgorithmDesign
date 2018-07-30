class Solution {
    public boolean search(int[] nums, int target) {
        
		int l=0,r=nums.length-1;
		int mid;
		while(l<r){
			mid=(l+r)/2;
			if(nums[mid]==target){
				return true;
			}

			if(nums[mid]>nums[l]){
				if(nums[l]<=target&&target<nums[mid]){
					r=mid-1;
				}else{
					l=mid+1;
				}
			}else if(nums[mid]<nums[l]){
				if(nums[mid]<target&&target<=nums[r]){
					l=mid+1;
				}else{
					r=mid-1;
				}
			}else{
				l++;
			}
			
		}

		return false;
    }
}