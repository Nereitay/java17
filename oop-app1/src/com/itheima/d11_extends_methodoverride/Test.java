package com.itheima.d11_extends_methodoverride;

/**
 * 方法重写
 * 在继承体系中，子类出现了和父类中一模一样的方法声明，我们就称子类这个方法是重写的方法
 * 当子类需要父类的功能，但父类的该功能不完全满足自己的需求时。子类可以重写父类中的方法
 */
public class Test {
    public static void main(String[] args) {
        NewPhone huawei = new NewPhone();
        huawei.call();
        huawei.sendMessage();
    }
    /*
        方法重写注意事项
            1. 重写方法的名称、形参列表必须与被重写方法的名称和参数列表一致
            2. 子类重写父类方法时，访问权限必须大于或者等于父类 （暂时了解 ：缺省 < protected < public）
            3. 私有方法不能被重写
            4. 子类不能重写父类的静态方法，如果重写会报错的
     */
}
