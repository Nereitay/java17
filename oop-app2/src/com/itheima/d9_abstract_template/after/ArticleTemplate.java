package com.itheima.d9_abstract_template.after;

/**
 * 模板方法模式解决了什么问题？
 *      - 极大的提高了代码的复用性
 *      - 模板方法已经定义了通用结构，模板不能确定的定义成抽象方法。
 *      - 使用者只需要关心自己需要实现的功能即可。
 */
public abstract class ArticleTemplate {

    /*
    模板方法我们是建议使用final修饰的，这样会更专业，那么为什么呢？
        模板方法是给子类直接使用的，不是让子类重写的，
            一旦子类重写了模板方法就失效了。
     */
    public final void write() {
        System.out.println("\t\t\t\t<My Hometown>");
        System.out.println("What's your hometown like?");

        mainBody();

        System.out.println("I love my hometown");
    }

    public abstract void mainBody();
}
