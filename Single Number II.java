import java.util.HashMap;
import java.util.Map;
class Solution {
    public  int[] singleNumber(int[] nums) {
     int[] ans=new int[2];  
             Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{map.put(nums[i], 1);}
        }int i=0;
                for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                ans[i++]=entry.getKey();
                if(i>1)
                    break;
            }
        }
return ans;
    }
}