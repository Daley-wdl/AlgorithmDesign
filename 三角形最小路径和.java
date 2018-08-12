
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0)
            return 0;

        List<List<Integer>> dp = new ArrayList<List<Integer>>();
        //��ʼ��dp����Ϊ0��ά��������������һ��
        for(int i = 0;i<triangle.size();++i)
        {
            dp.add(new ArrayList<Integer>());
            for(int j = 0;j <triangle.get(i).size();++j)
            {
                dp.get(i).add(0);
            }
        }
        //dp��������һ�о�����������������һ��
        for(int i = 0;i<triangle.get(triangle.size()-1).size();++i)
            dp.get(dp.size()-1).set(i,triangle.get(triangle.size()-1).get(i)) ;
        //�ӵ����ڶ��п�ʼ�����ϵ���
        for(int i = dp.size() - 2;i>=0;--i)
        {
            for(int j = 0;j<dp.get(i).size();++j)
                dp.get(i).set(j,Integer.min(dp.get(i+1).get(j),dp.get(i+1).get(j+1)) + triangle.get(i).get(j));
        }
        return dp.get(0).get(0);
    }
}