package com.wigen.beans.factory.io;

import com.wigen.beans.factory.util.ClassUtils;


/**
 * @author 18070900
 */
public class DefaultResourceLoader implements ResourceLoader {

    private ClassLoader classLoader;

    public DefaultResourceLoader() {}

    public DefaultResourceLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public Resource getResource(String location) {
        return new ClassPathResource(location, getClassLoader());
    }

    @Override
    public ClassLoader getClassLoader() {
        return this.classLoader != null ? this.classLoader : ClassUtils.getDefaultClassLoader();
    }
}
