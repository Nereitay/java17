package com.itheima.d7_extends;
/*
    子类 继承父类，子类可以得到父类的属性和行为，子类可以使用
 */
public class Teacher extends People{
    /*
       独有的行为
     */
    public void teach(){
        System.out.println("老师在快乐的教Java~~~~~");
    }

}
