package com.itheima.d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
     目标：不可变集合。
 不可变集合，就是不可被修改的集合。
    集合的数据项在创建的时候提供，并且在整个生命周期中都不可改变（定义完成后不可以修改，或者添加、删除）否则报错。

 为什么要创建不可变集合？
    - 如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践。
    - 或者当集合对象被不可信的库调用时，不可变形式是安全的

 如何创建不可变集合？
    - List、Set、Map接口中，都存在of方法可以创建不可变集合
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 1、不可变的List集合
        List<Double> lists = List.of(569.5, 700.5, 523.0,  570.5);
        // lists.add(689.0);
        // lists.set(2, 698.5);
        // System.out.println(lists);
        double score = lists.get(1);
        System.out.println(score);

        // 2、不可变的Set集合
        Set<String> names = Set.of("迪丽热巴", "迪丽热九", "马尔扎哈", "卡尔眨巴" );
        // names.add("三少爷");
        System.out.println(names);

        // 3、不可变的Map集合
        Map<String, Integer> maps = Map.of("huawei",2, "Java开发", 1 , "手表", 1);
        // maps.put("衣服", 3);
        System.out.println(maps);
    }
}
