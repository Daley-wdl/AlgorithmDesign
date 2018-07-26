class Solution {
    public List<String> letterCasePermutation(String S) {
        
		if(s==null){
			return null;
		}


		List<String> list=new ArrayList<String>();
		char[] a=S.toLowerCase().toCharArray();
		backtrack(a,0,list);
		return list;
    }

	public void backtrack(char[] a, int pos, List<String> res){
		if(pos==a.length){
			res.add(new String(a));
			return;
		}

		backtrack(a,pos+1,res);

		if(Character.isLetter(a[pos])){
			a[pos]=Character.toUpperCase(a[pos]);
			backtrack(a,pos+1,res);
			a[pos]=Character.toLowerCase(a[pos]);
		}
	}
}