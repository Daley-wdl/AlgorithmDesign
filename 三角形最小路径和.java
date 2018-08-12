
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0)
            return 0;

        List<List<Integer>> dp = new ArrayList<List<Integer>>();
        //初始化dp数组为0，维数和三角形数组一样
        for(int i = 0;i<triangle.size();++i)
        {
            dp.add(new ArrayList<Integer>());
            for(int j = 0;j <triangle.get(i).size();++j)
            {
                dp.get(i).add(0);
            }
        }
        //dp数组的最后一行就是三角形数组的最后一行
        for(int i = 0;i<triangle.get(triangle.size()-1).size();++i)
            dp.get(dp.size()-1).set(i,triangle.get(triangle.size()-1).get(i)) ;
        //从倒数第二行开始，往上递推
        for(int i = dp.size() - 2;i>=0;--i)
        {
            for(int j = 0;j<dp.get(i).size();++j)
                dp.get(i).set(j,Integer.min(dp.get(i+1).get(j),dp.get(i+1).get(j+1)) + triangle.get(i).get(j));
        }
        return dp.get(0).get(0);
    }
}