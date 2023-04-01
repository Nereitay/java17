package com.itheima.d2_stream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 需求：某个公司的开发部门，分为开发一部和二部，现在需要进行年中数据结算。
 * 分析：
 * 1：员工信息至少包含了(名称、性别、工资、奖金、处罚记录)
 * 2：开发一部有4个员工、开发二部有5名员工
 * 3：分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象Topperformer
 * 4：分别统计出2个部门的平均月收入，要求去掉最高和最低工资。
 * 5：统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值。
 */
public class StreamDemo04 {
    public static double allMoney ;
    public static double allMoney2 ; // 2个部门去掉最高工资，最低工资的总和

    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 30000, 25000, null));
        one.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        one.add(new Employee("沙僧", '男', 20000, 20000, null));
        one.add(new Employee("小白龙", '男', 20000, 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松", '男', 15000, 9000, null));
        two.add(new Employee("李逵", '男', 20000, 10000, null));
        two.add(new Employee("西门庆", '男', 50000, 100000, "被打"));
        two.add(new Employee("潘金莲", '女', 3500, 1000, "被打"));
        two.add(new Employee("武大郎", '女', 20000, 0, "下毒"));

        // 1、开发一部的最高工资的员工。（API）
        // 指定大小规则了
        Employee e0 = one.stream().max(Comparator.comparingDouble(e -> e.getSalary() + e.getBonus()))
                .get();
        System.out.println(e0);

        Topperformer t = one.stream().max((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .map(e -> new Topperformer(e.getName(), e.getSalary() + e.getBonus())).get();
        System.out.println(t);

        // 2、统计平均工资，去掉最高工资和最低工资
        one.stream().sorted(Comparator.comparingDouble(e -> e.getSalary() + e.getBonus()))
                .skip(1).limit(one.size() - 2).forEach(e -> {
                    // 求出总和：剩余员工的工资总和
                    allMoney += (e.getSalary() + e.getBonus());
                });
        System.out.println("开发一部的平均工资是：" + allMoney / (one.size() - 2));

        double average = one.stream().sorted(Comparator.comparingDouble(e -> e.getSalary() + e.getBonus()))
                .skip(1).limit(one.size() - 2).mapToDouble(m -> m.getBonus() + m.getSalary())
                .average().orElse(0);
        System.out.println("开发一部的average是：" + average);

        // 3、合并2个集合流，再统计
        Stream<Employee> s1 = one.stream();
        Stream<Employee> s2 = two.stream();
        Stream<Employee> s3 = Stream.concat(s1, s2);
        s3.sorted((e1, e2) -> Double.compare(e1.getSalary() + e1.getBonus(), e2.getSalary() + e2.getBonus()))
                .skip(1).limit(one.size() + two.size() - 2).forEach(e -> {
                    // 求出总和：剩余员工的工资总和
                    allMoney2 += (e.getSalary() + e.getBonus());
                });
        Double average2 = Stream.concat(one.stream(), two.stream())
                .sorted(Comparator.comparingDouble(e -> e.getSalary() + e.getBonus()))
                .skip(1).limit(one.size() + two.size() - 2)
                .collect(Collectors.averagingDouble(c -> c.getSalary() + c.getBonus()));

        // BigDecimal
        BigDecimal a = BigDecimal.valueOf(allMoney2);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size() - 2);
        System.out.println("开发部的平均工资是：" + a.divide(b, 2, RoundingMode.HALF_UP));
        System.out.println("开发部的average2是：" + BigDecimal.valueOf(average2).divide(b, 2, RoundingMode.HALF_UP));
    }
}
