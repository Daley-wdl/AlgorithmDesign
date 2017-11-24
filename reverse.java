class Solution {
    public int reverse(int x) {
        
       long result=0;
        
        if(x==0){
            return 0;
        }
        
        String str=new String();
		String flag="";
		if(x<0){
			flag="-";  
			//System.out.println(Integer.toString(x));
			str=Integer.toString(x).substring(1);
			//System.out.println(str);
		}else{
			str=Integer.toString(x);
		}
		
		char[] s=str.toCharArray();
		StringBuffer sb=new StringBuffer(str);
		str=sb.reverse().toString();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='0'){
				str=str.substring(i);
				break;
			}
		}
		
        result=Long.parseLong(flag+str);
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)   //overflow return 0
            return 0; 
		return Integer.valueOf(flag+str);
    }
}
