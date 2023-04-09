package com.itheima.d1_dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * DOM解析解析文档对象模型
 *  - Document对象：整个xml文档
 *  - Node对象
 *      · Element对象：标签
 *      · Attribute对象：属性
 *      · Text对象：文本内容
 * 使用Dom4J解析出XML文件
 *  需求：使用Dom4J把一个XML文件的数据进行解析
 *  分析：
 *      1. 下载Dom4j框架，官网下载。
 *      2. 在项目中创建一个文件夹：lib
 *      3. 将dom4j-2.1.1.jar文件复制到 lib 文件夹
 *      4. 在jar文件上点右键，选择 Add as Library -> 点击OK
 *      5. 在类中导包使用
   目标：学会使用dom4j解析XML文件中的数据。
    1、导入dom4j框架。
    2、准备一个XML文件。
 */
public class TestDom4JHelloWorld1 {
    @Test
    public void parseXMLData() throws Exception {
        /*
         1、创建一个Dom4j的解析器对象，代表了整个dom4j框架
         */
        SAXReader saxReader = new SAXReader();

        /*
         2、把XML文件加载到内存中成为一个Document文档对象
         */
        // Document document = saxReader.read(new File("xml-app\\src\\Contacts.xml")); // 需要通过模块名去定位
        // Document document = saxReader.read(new FileInputStream("xml-app\\src\\Contacts.xml"));

        /*
         注意: getResourceAsStream中的/是直接去src下寻找的文件,可以与模块名解耦合
         */
        InputStream is = TestDom4JHelloWorld1.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(is);

        /*
         3、获取根元素对象
         */
        Element root = document.getRootElement();
        System.out.println(root.getName());

        /*
         4、拿根元素下的全部子元素对象(一级)
         */
        // List<Element> sonEles =  root.elements();
        List<Element> sonEles = root.elements("contact");
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }

        /*
         拿某个子元素
         */
        Element userEle = root.element("user");
        System.out.println(userEle.getName());

        /*
         默认提取第一个子元素对象 (Java语言。)
         */
        Element contact = root.element("contact");
        /*
         获取子元素文本
         */
        System.out.println(contact.elementText("name"));
        /*
         去掉前后空格
         */
        System.out.println(contact.elementTextTrim("name"));
        /*
         获取当前元素下的子元素对象
         */
        Element email = contact.element("email");
        System.out.println(email.getText());
        /*
         去掉前后空格
         */
        System.out.println(email.getTextTrim());

        /*
         根据元素获取属性值
         */
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName() + "-->" + idAttr.getValue());
        /*
        直接提取属性值
         */
        System.out.println(contact.attributeValue("id"));
        System.out.println(contact.attributeValue("vip"));

    }
}
