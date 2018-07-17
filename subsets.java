class solution{

	public List<List<Integer>> subsets(int[] num){
	
		List<List<Integer>> list=new ArrayList<>();
		Arrays.sort(num);

		backSort(list,new tempList(),0,num);
		return list;
	} 

	public void backSort(List<List<Integer>> list,List<Integer> tempList,int start,int[] num){
		
		list.add(tempList);
		for(int i=start;i<num.length;i++){
			
			tempList.add(num[i]);
			backSort(list,tempList,i+1,num);
			tempList.remove(tempList.size()-1);
		}
	}
}
