package com.demo.gem.gem.example;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-05-27 09:27
 **/
@Component
public class ReadAppXml {

    public void read(String filePathName) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        //得到一个表示XML文档的Document对象
        Document doc = builder.parse(filePathName);
        //去掉XML中作为格式化内容的空白而映射在DOM树中的Text Node对象
        doc.normalize();
        //获取jdbc的配置值
        NodeList jdbc = doc.getElementsByTagName("jdbc");
        //只有一个jdbc,获取jdbc中的驱动类的名称
        NodeList driverClassNode = ((Element)jdbc.item(0)).getElementsByTagName("driver-class");
        String driverClass = driverClassNode.item(0).getFirstChild().getNodeValue();
        System.out.println("driverClass=="+driverClass);
        //同理获取url、user、password等的值
        NodeList urlNode = ((Element)jdbc.item(0)).getElementsByTagName("url");
        String url=urlNode.item(0).getFirstChild().getNodeValue();
        System.out.println("url=="+url);

        NodeList userNode = ((Element)jdbc.item(0)).getElementsByTagName("user");
        String user = userNode.item(0).getFirstChild().getNodeValue();
        System.out.println("user=="+user);

        NodeList passwordNode = ((Element)jdbc.item(0)).getElementsByTagName("password");
        String password = passwordNode.item(0).getFirstChild().getNodeValue();
        System.out.println("password=="+password);

        //获取application-xml
        NodeList applicationXmlNode =doc.getElementsByTagName("application-xml");
        String applicationXml = applicationXmlNode.item(0).getFirstChild().getNodeValue();
        System.out.println("applicationXml=="+applicationXml);
    }
}
