package com.wigen.beans.factory.support;

import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument;
import com.wigen.beans.factory.PropertyValue;
import com.wigen.beans.factory.config.BeanDefinition;
import com.wigen.beans.factory.io.DefaultResourceLoader;
import com.wigen.beans.factory.io.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.InputStream;

/**
 * @author 18070900
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    public XmlBeanDefinitionReader(ResourceLoader resourceLoader) {
        super(resourceLoader);
    }

    public void readXml(String location) throws Exception {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        InputStream is = resourceLoader.getResource(location).getInputStream();

        // 获取document
        Document doc = new DefaultDocument();

        // 根据document内容注册beandefinition
        registerBeanDefinitions(doc);
        is.close();
    }

    private void registerBeanDefinitions(Document doc) {
        Element el = doc.getDocumentElement();

        // 解析根节点 添加进容器
        parseBeanDefinitions(el);
    }

    private void parseBeanDefinitions(Element element) {
        // 获取子节点

        // 处理节点内容 属性注入 bean注入
        processBeanDefinition(element);
    }

    private void processBeanDefinition(Element element) {
        String name = element.getAttribute("name");
        String className = element.getAttribute("class");

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setClassName(className);

        // 属性注入
        addPropertyValues(element, beanDefinition);

        // 容器注入
        getRegistry().put(name, beanDefinition);
    }

    private void addPropertyValues(Element element, BeanDefinition beanDefinition) {
        // element获取属性值 <property name="" value="" />
        String name = "";
        String value = "";

        beanDefinition.getPropertyValues().addPropertyValues(new PropertyValue(name, value));
    }
}
