package com.itheima.d1_dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * XML解析案例
 * 需求:利用Dom4J的知识，将Contact.xml文件中的联系人数据封装成List集合，其中每个元素是实体类Contact。打印输出 List 中的每个元素
 */
public class TestDom4J2 {
    @Test
    public void parseToList() throws Exception {
        // 需求：解析XML中的数据成为一个List集合对象。
        // 1、导入框架（做过）
        // 2、创建SaxReader对象
        SAXReader saxReader = new SAXReader();
        // 3、加载XML文件成为文档对象Document对象。
        Document document =
                saxReader.read(TestDom4J2.class.getResourceAsStream("/Contacts.xml"));
        // 4、先拿根元素
        Element root = document.getRootElement();
        // 5、提取contact子元素
        List<Element> contactEles = root.elements("contact");
        // 6、准备一个ArrayList集合封装联系人信息
        List<Contact> contacts = new ArrayList<>();
        // 7、遍历Contact子元素
        for (Element contactEle : contactEles) {
            // 8、每个子元素都是一个联系人对象
            Contact contact = new Contact();
            /*
            xml内容都是文本
             */
            contact.setId(Integer.parseInt(contactEle.attributeValue("id")));
            contact.setVip(Boolean.parseBoolean(contactEle.attributeValue("vip")));
            contact.setName(contactEle.elementTextTrim("name"));
            contact.setGender(contactEle.elementTextTrim("gender").charAt(0));
            contact.setEmail(contactEle.elementText("email"));
            // 9、把联系人对象数据加入到List集合
            contacts.add(contact);
        }
        // 10、遍历List集合
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
