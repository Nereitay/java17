package com.itheima.arraylist;

import java.util.ArrayList;

/**
   案例：从集合中遍历元素且删除。

    从集合中遍历元素，并筛选出元素删除它，应该怎么解决？
        --从集合后面遍历然后删除，可以避免漏掉元素

 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        // 1、创建集合对象：存入学生成绩(98,77,66,89,79,50,100)
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);
        // [98, 77, 66, 89, 79, 50, 100]
        // [98, 66, 89, 50, 100] 删除一个元素后，后面的元素会往前移动填补空位
        //                   i

        // 1、遍历集合中的每个元素
        /*for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            // 2、判断这个分数是否低于80分，如果低于则从集合中删除它
            if(score < 80){
                scores.remove(i);
            }
        }
        System.out.println(scores);*/

        //解决方案一
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            // 2、判断这个分数是否低于80分，如果低于则从集合中删除它
            if(score < 80){
                scores.remove(i);
                i--; //删除成功后往前退一步，保证下次回到这个位置，如此则不会跳过数据
            }
        }
        System.out.println(scores);


        // [98, 77, 66, 89, 79, 50, 100]
        // [98,  89, 100]
        //   i

        for (int i = scores.size() - 1; i >= 0 ; i--) {
            int score = scores.get(i);
            // 2、判断这个分数是否低于80分，如果低于则从集合中删除它
            if(score < 80){
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}






