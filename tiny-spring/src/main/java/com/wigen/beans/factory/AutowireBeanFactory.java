package com.wigen.beans.factory;

import com.wigen.beans.factory.config.BeanDefinition;

import java.lang.reflect.Field;

/**
 * @author 18070900
 */
public class AutowireBeanFactory extends AbstractBeanFactory {

    @Override
    Object doCreateObj(BeanDefinition beanDefinition) throws Exception {
        Object bean = beanDefinition.getBeanClass().newInstance();

        // 根据beandefinition给bean 注入属性
        addBeanPropertyValues(bean, beanDefinition);

        return bean;
    }

    private void addBeanPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue pv : beanDefinition.getPropertyValues().getPropertyValues()) {
            Field declaredField = bean.getClass().getDeclaredField(pv.getName());
            declaredField.setAccessible(true);
            Object value = pv.getValue();
            // 反射注入属性
            declaredField.set(bean, value);
        }
    }
}
