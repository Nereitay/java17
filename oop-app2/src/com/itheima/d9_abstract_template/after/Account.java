package com.itheima.d9_abstract_template.after;

/**
 * 模板方法模式实现步骤
 *  1. 把功能定义成一个所谓的模板方法，放在抽象类中，模板方法中只定义通用且能确定的代码。
 *  2. 模板方法中不能决定的功能定义成抽象方法让具体子类去实现。
 */
public abstract class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
      模板方法
     */
    public final void handle(String loginName , String passWord ){
        // a.判断登录是否成功
        if("itheima".equals(loginName) && "123456".equals(passWord)){
            System.out.println("登录成功。。");
            // b.正式结算利息
            // 当前模板方法知道所有子类账户都要结算利息，但是具体怎么结算，模板不清楚，交给具体的子类来计算
            double result = calc();
            // c.输出利息详情
            System.out.println("本账户利息是："+ result);
        }else{
            System.out.println("用户名或者密码错误了");
        }
    }

    public abstract double calc();


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
