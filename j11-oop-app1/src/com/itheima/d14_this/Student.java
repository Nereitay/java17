package com.itheima.d14_this;

/**
 * this() 访问本类构造器
 *
 * this(...)和super(…)使用注意点：
 *  - 子类通过 this (...）去调用本类的其他构造器，本类其他构造器会通过 super 去手动调用父类的构造器，最终还是会调用父类构造器的
 *  - 注意：this(…) super(…) 都只能放在构造器的第一行，所以二者不能共存在同一个构造器中
 */
public class Student {
    private String name;
    private String schoolName;

    public Student() {
    }

    public Student(String name) {
        /*
        借用兄弟构造器！
         */
//        super();
        this(name, "黑马培训中心"); // 如果学生不填写学校，默认这个对象的学校是黑马
    }


    public Student(String name, String schoolName) {
        // super(); //必须先初始化父类，再初始化自己
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
