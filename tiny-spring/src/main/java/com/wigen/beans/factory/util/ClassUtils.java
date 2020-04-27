package com.wigen.beans.factory.util;

/**
 * @author 18070900
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader classLoader = null;

        classLoader = Thread.currentThread().getContextClassLoader();

        if (classLoader == null) {
            classLoader = ClassUtils.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
        }

        return classLoader;
    }
}
