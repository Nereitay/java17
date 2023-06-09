package com.itheima.d9_proxy;

public class Test {
    public static void main(String[] args) {
        /*
        创建一个对象，对象的类必须实现接口
         */
        // 1、把业务对象，直接做成一个代理对象返回，代理对象的类型也是 UserService类型
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "1234"));
        System.out.println(userService.deleteUsers());
        userService.selectUsers();
        userService.updateUsers(); // 走代理
    }
}
