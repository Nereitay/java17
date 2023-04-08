package com.itheima.d1_junit;

import org.junit.*;

/**
 * 单元测试
 *  - 单元测试就是针对最小的功能单元编写测试代码，Java程序最小的功能单元是方法，
 *      因此，单元测试就是针对Java方法的测试，进而检查方法的正确性
 * <p>
 * JUnit优点
 *  - JUnit可以灵活的选择执行哪些测试方法，可以一键执行全部测试方法。
 *  - Junit可以生成全部方法的测试报告。
 *  - 单元测试中的某个方法测试失败了，不会影响其他测试方法的测试
 * <p>
 * JUnit单元测试的实现过程是什么样的？
 *      - 必须导入Junit框架的jar包。
 *      - 定义的测试方法必须是无参数无返回值，且公开的方法。
 *      - 测试方法使用@Test注解标记。
 * JUnit测试某个方法，测试全部方法怎么处理？成功的标志是什么
 *      - 测试某个方法直接右键该方法启动测试。
 *      - 测试全部方法，可以选择类或者模块启动。
 *      - 红色失败，绿色通过。
   测试类
 */
public class TestUserService {
    /*
    开始执行的方法:初始化资源。ej. IO流
    执行完之后的方法:释放资源
     */

    /*
     修饰实例方法的 @Before @After Junit5 -> @BeforeEach @AfterEach
     该方法会在每一个测试方法执行之前执行一次
     */
    @Before
    public void before(){
        System.out.println("===before方法执行一次===");
    }

    @After
    public void after(){
        System.out.println("===after方法执行一次===");
    }

    /*
     修饰静态方法 @BeforeClass @AfterClass Junit5 -> @BeforeAll @AfterAll
     该方法会在所有测试方法之前只执行一次
     */
    @BeforeClass
    public static void beforeClass(){
        System.out.println("===beforeClass方法执行一次===");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("===afterClass方法执行一次===");
    }


    /*
       测试方法
       注意点：
            1、必须是公开的，无参数 无返回值的方法
            2、测试方法必须使用@Test注解标记。
     */
    @Test
    public void testLoginName(){
        UserService userService = new UserService();
        String rs = userService.loginName("admin","123456");

        /*
         进行预期结果的正确性测试：断言。针对有返回值的方法
         */
        Assert.assertEquals("您的登录业务可能出现问题", "登录成功", rs );
    }

    @Test
    public void testSelectNames(){
        UserService.selectNames();
    }

}
