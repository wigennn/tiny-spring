package com.wigen.beans.factory.support;

import com.wigen.beans.factory.config.BeanDefinition;
import com.wigen.beans.factory.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 18070900
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    /**
     * 注册bean容器
     */
    private Map<String, BeanDefinition> registry;

    /**
     * 资源加载器
     */
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
