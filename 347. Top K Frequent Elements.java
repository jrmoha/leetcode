class Solution {
    public int[] topKFrequent(int[] a, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[k];
        int n=a.length;
        for(int i=0;i<n;i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        PriorityQueue<Integer[]> queue=new PriorityQueue<>((p1,p2)->{
        return p2[1]-p1[1];
        });
        map.entrySet().forEach((e) -> {
            queue.add(new Integer[]{e.getKey(),e.getValue()});
        });
for(int i=0;i<k;i++){
    result[i]=queue.remove()[0];
}
        
        return result;
    }
}