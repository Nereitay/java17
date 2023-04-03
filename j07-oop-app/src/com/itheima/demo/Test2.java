package com.itheima.demo;

/**
 * 目标：完成电影信息的展示示例，理解面向对象编程的代码
 */
public class Test2 {

    public static void main(String[] args) {
        //1. 设计电影类
        //2. 创建3个电影对象，封装电影的信息
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("<<John Wick 4>>", 9.7, "Keanu Reeves");
        movies[1] = new Movie("<<¡Shazam! La furia de los dioses>>", 9.6, "Rachel Zegler");
        movies[2] = new Movie("<<Momias>>", 9.5, "Sean Bean");

        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie);
        }
    }
}
