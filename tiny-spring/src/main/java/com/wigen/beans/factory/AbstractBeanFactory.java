package com.wigen.beans.factory;

import com.wigen.beans.factory.config.BeanDefinition;

import java.util.HashMap;

/**
 * @author 18070900
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    private HashMap<String, BeanDefinition> map = new HashMap<>();

    @Override
    public Object getBean(String name) throws Exception {
        return map.get(name);
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        Object bean = doCreateObj(beanDefinition);
        beanDefinition.setBean(bean);
        map.put(name, beanDefinition);
    }

    abstract Object doCreateObj(BeanDefinition beanDefinition) throws Exception;
}
