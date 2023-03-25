package com.itheima.d8_innerclass_anonymous;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   目标：通过GUI编程 理解匿名内部类的真实使用场景

 开发中不是我们主动去定义匿名内部类的，而是别人需要我们写或者我们可以写的时候才会使用。
 匿名内部类的代码可以实现代码进一步的简化（回扣主题）
 */
public class Test3 {
    public static void main(String[] args) {
        // 1、创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        // 2、创建一个按钮对象
        JButton btn = new JButton("登录");

        // 注意：讲解匿名内部类的使用
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win, "点我一下，说明爱我！");
            }
        });

        /*
        代码简化
         */
//        btn.addActionListener( e ->  JOptionPane.showMessageDialog(win, "别说话，吻我！！") );


        // 3、把按钮对象添加到桌布上展示
        panel.add(btn);

        // 4、展示窗口
        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
