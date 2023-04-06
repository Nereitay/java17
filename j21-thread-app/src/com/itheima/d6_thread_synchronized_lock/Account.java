package com.itheima.d6_thread_synchronized_lock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
    账户类：余额 , 卡号。
 */
public class Account {
    private String cardId;
    private double money; // 余额 关键信息
    /*
     final修饰后：锁对象是唯一和不可替换的，非常专业
     */
    private final Lock lock = new ReentrantLock();

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
      Lock锁
        - 为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock，更加灵活、方便
        - Lock实现提供比使用synchronized方法和语句可以获得更广泛的锁定操作
        - Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来构建Lock锁对象
     */
    public void drawMoney(double money) {
        // 1、拿到是谁来取钱
        String name = Thread.currentThread().getName();
        // 2、判断余额是否足够
        // 小明  小红
        lock.lock(); // 上锁
        try {
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
        } finally {
            lock.unlock(); // 解锁
        }

    }
}
