package com.itheima.javabean;

/**
 * JAVA Bean
 * 也可以理解成实体类，其对象可以用于在程序中封装数据
 */
public class User {
    /*
    标准JAVA Bean 寻满足如下要求：
     */
    // 1. 成员变量使用private修饰
    private double height;
    private String name;
    private double salary;
    private String address;
    private String phone;

    //3. 必须提供一个无参构造器
    public User() {
    }

    public User(double height, String name, double salary, String address, String phone) {
        this.height = height;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.phone = phone;
    }

    //2. 提供每一个成员变狼对应的setter getter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
