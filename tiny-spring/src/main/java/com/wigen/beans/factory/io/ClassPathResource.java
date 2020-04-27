package com.wigen.beans.factory.io;

import java.io.InputStream;

/**
 * @author 18070900
 */
public class ClassPathResource implements Resource {

    private String path;

    private ClassLoader classLoader;

    public ClassPathResource(String path, ClassLoader classLoader) {
        this.path = path;
        this.classLoader = classLoader;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        return null;
    }
}
