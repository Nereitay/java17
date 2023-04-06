package com.itheima.d5_thread_synchronized_method;

/**
    账户类：余额，卡号
 */
public class Account {
    private String cardId;
    private double money; // 余额 关键信息

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

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

    /*
      同步方法
        修饰符 synchronized 返回值类型 方法名称(形参列表) {
        	操作共享资源的代码
        }
      作用：把出现线程安全问题的核心方法给上锁。
      原理：每次只能一个线程进入，执行完毕以后自动解锁，其他线程才可以进来执行

      同步方法底层原理
        - 同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码。
        - 如果方法是实例方法：同步方法默认用this作为的锁对象。但是代码要高度面向对象！
        - 如果方法是静态方法：同步方法默认用类名.class作为的锁对象

      是同步代码块好还是同步方法好一点？
        - 同步代码块锁的范围更小，同步方法锁的范围更大
     */
    public synchronized void drawMoney(double money) {
        // 1、拿到是谁来取钱
        String name = Thread.currentThread().getName();
        // 2、判断余额是否足够
        // 小明  小红
        if(this.money >= money){
            // 钱够了
            System.out.println(name+"来取钱，吐出：" + money);
            // 更新余额
            this.money -= money;
            System.out.println(name+"取钱后，余额剩余：" + this.money);
        }else{
            // 3、余额不足
            System.out.println(name+"来取钱，余额不足！");
        }
    }
}
