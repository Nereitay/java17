package com.itheima.d13_extends_constructor2;

/**
 * 继承后：子类构造器访问父类有参构造器
 * super调用父类有参数构造器的作用：
 *  - 初始化继承自父类的数据。
 *
 * 如果父类中没有无参数构造器，只有有参构造器，会出现什么现象呢？
 *  - 会报错。因为子类默认是调用父类无参构造器的。
 *
 * 如何解决？
 *  - 子类构造器中可以通过书写 super(…)，手动调用父类的有参数构造器
 */
public class Student extends People{
    private String className;

    public Student(){
    }

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
