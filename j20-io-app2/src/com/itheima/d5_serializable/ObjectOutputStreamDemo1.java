package com.itheima.d5_serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

/**
 * 对象序列化的含义是什么？
 *  - 把对象数据存入到文件中去。
 * 对象序列化用到了哪个流？
 *  - 对象字节输出流ObjectOutputStream
 *  - public void writeObject(Object obj)
 * 序列化对象的要求是怎么样的？
 *  - 对象必须实现序列化接口

     目标：学会对象序列化，使用 ObjectOutputStream 把内存中的对象存入到磁盘文件中。

     transient修饰的成员变量不参与序列化了
     对象如果要序列化，必须实现Serializable序列化接口。

     申明序列化的版本号码
     序列化的版本号与反序列化的版本号必须一致才不会出错！
     private static final long serialVersionUID = 1;

 */
public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        /*
         1、创建学生对象
         */
        Student s = new Student("陈磊", "chenlei","1314520", 21);

        /*
         2、对象序列化：使用对象字节输出流包装字节输出流管道
         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-app2/src/obj.txt"));

        /*
         3、直接调用序列化方法
         */
        oos.writeObject(s);

        /*
         4、释放资源
         */
        oos.close();
        System.out.println("序列化完成了~~");

    }
}
