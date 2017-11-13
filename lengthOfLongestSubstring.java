class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0,index=0;
    	Map<Character,Integer> map;
    	
    	if(s==null||s==""){
    		return 0;
    	}
    	if(s.length()==1){
    		return 1;
    	}
    	
    	while(index<s.length()){
    		map=new HashMap<Character, Integer>();
    		map.put(s.charAt(index), index);
    		
    		for(int i=index+1;i<s.length();i++){

    			if(map.get(s.charAt(i))==null){
    				map.put(s.charAt(i), i);
    			}else {
    				max = map.size() > max ? map.size() : max;
    				break;
				}
    			
    			if(i==s.length()-1){
    				max=map.size() > max ? map.size():max;
    			}
    		}
    		index++;
    	}
    	
    	return max;
    }
    
    
}
