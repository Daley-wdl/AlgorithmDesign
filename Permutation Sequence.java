class Solution {
    public String getPermutation(int n, int k) {
        
		StringBuilder sb=new StringBuilder();
		int num=k;
		int factorial=calFactorial(n);

		StringBuilder s=new StringBuilder();
		for(int i=1;i<=n;i++){
			s.append(i);
		}

		for(int i=n;i>=1;i--){
		
			factorial/=i;
			int index=(num-1)/factorial;
			String tmp=""+s.charAt(index);
			sb.append(tmp);
			num-=index*factorial;
			s=s.deleteCharAt(index);
		}
		return sb.toString();
    }

	public int calFactorial(int n){
		int ans=1;
		for(int i=1;i<=n;i++){
			ans*=i;
		}
		return ans;
	}
}