class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double media=0;
        
        if(nums1==null&&nums2==null){
        	return 0;
        }else if(nums1==null&&nums2!=null){
        	if(0==nums2.length%2){
        		media = nums2[nums2.length/2]+nums2[nums2.length/2-1];
        	}else{
        		media=nums2[nums2.length/2];
        	}
        }else if(nums2==null&&nums1!=null){
        	if(0==nums1.length%2){
        		media = nums1[nums1.length/2]+nums1[nums1.length/2-1];
        	}else{
        		media=nums1[nums1.length/2];
        	}
        }else{

        	int[] temp=Arrays.copyOf(nums1, nums1.length+nums2.length);
        	System.arraycopy(nums2, 0, temp, nums1.length, nums2.length);
        	Arrays.sort(temp);
        	
        	if(0==temp.length%2){
        		media = ((double)(temp[temp.length/2]+temp[temp.length/2-1]))/2;
        	}else{
        		media=temp[temp.length/2];
        	}
        	
        }
        
        return media;
    }
}
