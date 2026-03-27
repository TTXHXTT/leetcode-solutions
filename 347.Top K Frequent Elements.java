class Solution {
    public int[] topKFrequent(int[] nums, int k) {

First, I count the frequency of each number using a HashMap.

Then I use a min heap of size k,
where each element stores the number and its frequency.

I go through the map and push elements into the heap.
If the heap size exceeds k, I remove the smallest frequency.

This way, the heap keeps the top k frequent elements.

Finally, I get the result from the heap.

Time is O(n log k), space is O(n).
        
        //统计出现次数
        HashMap<Integer,Integer> frep = new HashMap<>();
        //遍历数组并存入
        for(int x : nums) frep.put(x,frep.getOrDefault(x,0)+1);

        //创建最小堆，用于存储结果
        //(a,b) -> a[1] - b[1]   告诉堆如何比较，即比较数组中第二个元素
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[1] - b[1]);


        //HashMap 是 Map 的一种实现，
        //Map.Entry 是 Map 里的一条“键值对”。
        //这是里面的一条 (key, value)

        //一个 Map 有三种常用遍历方式：
        //keySet()	所有 key
        //values()	所有 value
        //entrySet()	所有 (key, value) 对
        for(Map.Entry<Integer,Integer> e : frep.entrySet()){
            //将得到的数据压入堆中
            heap.offer(new int[]{e.getKey(),e.getValue()});
            //保持堆为k个元素，超出poll掉最小的堆顶
            if(heap.size()>k){
                heap.poll();
            }
        }
        //将最终得到的最小堆的没一个数组第一个元素（即nums中出现的元素），存入最终结果数组中
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=heap.poll()[0];      
        }
        return res;
    }
}
