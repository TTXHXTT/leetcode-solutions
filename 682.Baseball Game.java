class Solution {
    public int calPoints(String[] operations) {

I use a stack to simulate the operations.

For each operation:
if it's "+", I add the last two scores;
if it's "D", I double the last score;
if it's "C", I remove the last score;
otherwise, I push the number.

At the end, I sum all values in the stack.

Time is O(n), space is O(n).
        
        // 用栈来存储每一轮有效的得分
        Stack<Integer> stack = new Stack<>();

        // 遍历所有操作
        for (String op : operations) {

            // 情况1：当前得分 = 前两个得分之和
            if (op.equals("+")) {
                // 先取出栈顶元素
                int top = stack.pop();
                // 新得分 = 栈顶 + 次栈顶
                int newScore = top + stack.peek();
                // 把刚刚弹出的元素放回去
                stack.push(top);
                // 把新得分入栈
                stack.push(newScore);

            // 情况2：当前得分 = 前一个得分的两倍
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);

            // 情况3：删除前一个得分
            } else if (op.equals("C")) {
                stack.pop();

            // 情况4：普通数字，直接入栈
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        // 计算最终总和
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}
