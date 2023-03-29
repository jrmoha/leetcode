import java.util.LinkedList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new LinkedList<>();
        List<Integer> tmp;
        for(int i=1;i<=numRows;i++){
            tmp=new LinkedList<>();
            if(i==1||i==2){
                for(int j=0;j<i;j++)
                    tmp.add(1);
            }else{
                tmp.add(1);
                for(int j=1;j<i-1;j++){
                    tmp.add(list.get(i-2).get(j)+list.get(i-2).get(j-1));
                }
                tmp.add(1);
            }
            list.add(tmp);
        }return list;
    }
    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex+1).get(rowIndex);
    }
}