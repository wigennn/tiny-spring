package com.wigen.beans.factory;

import com.wigen.beans.factory.config.BeanDefinition;

/**
 * @author 18070900
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param name
     * @return
     * @throws Exception
     */
    Object getBean(String name) throws Exception;

    /**
     * 注册bean
     * @param name
     * @param bean
     * @throws Exception
     */
    void registerBeanDefinition(String name, BeanDefinition bean) throws Exception;
}
