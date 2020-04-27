package com.wigen.beans.factory.config;

import com.wigen.beans.factory.PropertyValues;

/**
 * @author 18070900
 */
public class BeanDefinition {

    /**
     * bean
     */
    private Object bean;

    /**
     * bean class
     */
    private Class beanClass;

    /**
     * class name
     */
    private String className;

    /**
     * bean 属性
     */
    private PropertyValues propertyValues;

    public Object getBean() {
        return this.bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return this.beanClass;
    }

    public void setClassName(String className) {
        this.className = className;
        try {
            this.beanClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public PropertyValues getPropertyValues() {
        return this.propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }


}
