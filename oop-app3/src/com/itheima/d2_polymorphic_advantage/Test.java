package com.itheima.d2_polymorphic_advantage;
/**
 多态优势
 - 在多态形式下，右边对象可以实现解耦合，便于扩展和维护
 - 定义方法的时候，使用父类型作为参数，该方法就可以接收这父类的一切子类对象，体现出多态的扩展性与便利

 多态下会产生的一个问题:
 多态下不能使用子类的独有功能
 */
public class Test {
    public static void main(String[] args) {
        Animal d = new Dog();
        go(d);
        /*
        多态下不能使用子类的独有功能
         */
        // d.lookDoor();

        Animal t = new Tortoise();
        go(t);
    }

    /*
    定义方法的时候，使用父类型作为参数，该方法就可以接收这父类的一切子类对象，体现出多态的扩展性与便利
       希望这个方法可以接收一切子类动物对象
     */
    public static void go(Animal a){
        System.out.println("预备~~~");
        a.run();
        System.out.println("结束~~~~");
    }
}
