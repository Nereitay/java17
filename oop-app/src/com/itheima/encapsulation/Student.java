package com.itheima.encapsulation;

/**
 * 封装的实现步骤
 */
public class Student {
    /*
    1. 一般对成员变量使用private(私有)关键字修饰进行隐藏，private修饰后该成员变量就只能在当前类中访问
     */
    // private私有的成员变量，只能在本类访问。
   private int age;

   /*
    2. 提供public修饰的公开的getter、setter方法暴露其取值和赋值
    */
   public int getAge(){
       return age;
   }

   public void setAge(int age){
        if(age >= 0 && age <= 200){
            this.age = age;
        }else {
            System.out.println("年龄数据有问题，应该不是人的年龄！");
        }
   }
}
