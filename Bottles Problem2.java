/*
3100. Water Bottles II
3100. 水瓶 II
Solved
  已解决
Medium
  中等
Topics
  主题
premium lock icon
Companies  公司  公司 公司
Hint
  提示
You are given two integers numBottles and numExchange.
给你两个整数 numBottles 和 numExchange 。

numBottles represents the number of full water bottles that you initially have. In one operation, you can perform one of the following operations:
numBottles 代表你最初拥有的满水瓶数量。在每次操作中，你可以执行以下操作之一：

Drink any number of full water bottles turning them into empty bottles.
喝掉任意数量的满水瓶，将它们变成空瓶。
Exchange numExchange empty bottles with one full water bottle. Then, increase numExchange by one.
用 numExchange 个空瓶交换一个满水瓶。然后， numExchange 数量增加一。
Note that you cannot exchange multiple batches of empty bottles for the same value of numExchange. For example, if numBottles == 3 and numExchange == 1, you cannot exchange 3 empty water bottles for 3 full bottles.
请注意，你不能用多个批次且数量相同的空瓶来交换相同数量的满水瓶。例如，如果 numBottles == 3 和 numExchange == 1 ，你不能用 3 个空水瓶交换 3 个满水瓶。

Return the maximum number of water bottles you can drink.
返回你可以喝的最大水瓶数量。

 

Example 1:  示例 1：  示例 1： 示例 1：


Input: numBottles = 13, numExchange = 6
Output: 15
Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.
Example 2:  示例 2：  示例 2： 示例 2：


Input: numBottles = 10, numExchange = 3
Output: 13
Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.
 
*/

class Solution {

    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        for (int empty = numBottles; empty >= numExchange; numExchange++) {
            ans++;
            empty -= numExchange - 1;
        }
        return ans;
    }
}