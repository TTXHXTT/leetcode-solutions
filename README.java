    链表
    List<Integer> list = new ArrayList<>();

        list.add(1);
        int x = list.get(0);
        list.remove(1);
        list.size();
        list.isEmpty();

      ListNode = 链表的最小组成单元
      List = 已经封装好的“整条链表”
    ListNode res1 = new ListNode();
        ListNode res = null;
        ListNode curr = head.next;


    双端队列
    Deque<Integer> deque = new ArrayDeque<>();
        方法	        作用	    失败时
        addFirst(e)	  队头插入	 抛异常
        offerFirst(e)	队头插入	 返回 false
        removeFirst()	移除队头	 抛异常
        pollFirst()	  移除队头	 返回 null
        getFirst()	  查看队头	 抛异常
        peekFirst()	  查看队头 	 返回 null
        结尾则换成Last

          
    这是一个默认完整的二叉树，小顶堆
    PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(3);    添加，最小值去到堆顶（树顶）
        heap.peek();    返回最小值，不删除（空时返回 null）
        heap.poll();    删除并返回最小值（空时返回 null）
        heap.isEmpty(); 判空
        heap.size();    大小

        <--大顶堆-->
        PriorityQueue<Integer> heap =
              new PriorityQueue<>((a, b) -> b - a);


    哈希HashMap
    HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "a");         添加 / 覆盖
        map.get(1);              根据 key 取 value
        map.containsKey(1);      是否存在 key
        map.remove(1);           删除
        map.size();              大小
        map.isEmpty();           判空
        Entry：Map 中的真实节点，setValue 直接改 Map
          
    哈希HashSet
    HashSet<Integer> set = new HashSet<>();

        set.add(1);              添加
        set.remove(1);           删除
        set.contains(1);         是否存在
        set.size();              大小
        set.isEmpty();           判空


    树  Tree
    TreeNode root = new TreeNode(1);

    root.left = n2;
    root.right = n3;






























