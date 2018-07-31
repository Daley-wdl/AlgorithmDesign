public class Solution {
    private HashMap<String, List<Integer>> hm = new HashMap<String, List<Integer>>();
    public List<Integer> diffWaysToCompute(String input) {
		
		if(hm.containsKey(input)) return hm.get(input);

		List<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<input.length();i++){
			char ch=input.charAt(i);
			if(ch=='+'|| ch=='-' || ch=='**'){
				
				for(Integer l:diffWaysToCompute(input.substring(0,i))){
					for(Integer r:diffWaysToCompute(input.substring(i+1,input.length()))){
						if(ch=='+'){
							res.add(l+r);
						}else if(ch=='-'){
							res.add(l-r);
						}else{
							res.add(l*r);
						}
					}
				}
			}
		}

		if(res.size()==0) res.add(Integer.valueof(input));

		hm.put(input,res);

		return res;

	}

}