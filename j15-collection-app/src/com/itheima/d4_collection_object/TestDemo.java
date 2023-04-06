package com.itheima.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 需求：
 *     某影院系统需要在后台存储上述三部电影，然后依次展示出来
 */
public class TestDemo {
    public static void main(String[] args) {
        // 1、定义一个电影类
        // 2、定义一个集合对象存储3部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《你好，李焕英》", 9.5, "张小斐,贾玲,沈腾,陈赫"));
        movies.add(new Movie("《唐人街探案》", 8.5, "王宝强,刘昊然,美女"));
        movies.add(new Movie("《刺杀小说家》",8.6, "雷佳音,杨幂"));

        System.out.println(movies);

        // 3、遍历集合容器中的每个电影对象
        for (Movie movie : movies) {
            if (movie.getScore() == 9.5)
                movie.setScore(9.9); //foreach中对象内容修改成功
            System.out.println("片名：" + movie.getName());
            System.out.println("得分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
        }

    }
}