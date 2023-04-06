package com.itheima.d4_thread_synchronized_code;

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

//    // 100个线程人
//    public static void run(){
//        synchronized (Account.class){
//
//        }
//    }


    /*
      线程同步的核心思想
        - 加锁，把共享资源进行上锁，每次只能一个线程进入访问完毕以后解锁，然后其他线程才能进来
        - 加锁：让多个线程实现先后依次访问共享资源，这样就解决了安全问题
     */
    public void drawMoney(double money) {
        // 1、拿到是谁来取钱
        String name = Thread.currentThread().getName();
        /*
         同步代码块
         synchronized(同步锁对象) {
         	操作共享资源的代码(核心代码)
         }
         锁对象要求 => 理论上：锁对象只要对于当前同时执行的线程来说是同一个对象即可

         锁对象用任意唯一的对象好不好呢?
            - 不好，会影响其他无关线程的执行。
         锁对象的规范要求
            - 规范上：建议使用共享资源作为锁对象。
            - 对于实例方法建议使用this作为锁对象。
            - 对于静态方法建议使用字节码（类名.class）对象作为锁对象
         */
        // 小明 小红
        // this == acc 共享账户
        synchronized (this) {
            // 2、判断余额是否足够
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
}
