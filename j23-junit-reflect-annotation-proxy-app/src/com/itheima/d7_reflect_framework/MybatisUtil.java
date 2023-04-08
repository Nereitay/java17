package com.itheima.d7_reflect_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * 需求
 *     - 给你任意一个对象，在不清楚对象字段的情况可以，可以把对象的字段名称和对应值存储到文件中去
 * 分析
 *      1. 定义一个方法，可以接收任意类的对象。
 *      2. 每次收到一个对象后，需要解析这个对象的全部成员变量名称。
 *      3. 这个对象可能是任意的，那么怎么样才可以知道这个对象的全部成员变量名称呢？
 *      4. 使用反射获取对象的Class类对象，然后获取全部成员变量信息。
 *      5. 遍历成员变量信息，然后提取本成员变量在对象中的具体值
 *      6. 存入成员变量名称和值到文件中去即可
 */
public class MybatisUtil {
    /**
     * 保存任意类型的对象
     *
     * @param obj
     */
    public static void save(Object obj) {
        try (
                PrintStream ps = new PrintStream(
                        new FileOutputStream("j23-junit-reflect-annotation-proxy-app/src/data.txt", true))
        ) {
            /*
             1、提取这个对象的全部成员变量：只有反射可以解决
             */
            Class c = obj.getClass();  //   c.getSimpleName()获取当前类名   c.getName获取全限名：包名+类名
            ps.println("================" + c.getSimpleName() + "================");

            /*
             2、提取它的全部成员变量
             */
            Field[] fields = c.getDeclaredFields();
            /*
             3、获取成员变量的信息
             */
            for (Field field : fields) {
                String name = field.getName();
                // 提取本成员变量在obj对象中的值（取值）
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
