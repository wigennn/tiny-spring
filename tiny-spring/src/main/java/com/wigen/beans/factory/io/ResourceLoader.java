package com.wigen.beans.factory.io;


/**
 * @author 18070900
 */
public interface ResourceLoader {

    Resource getResource(String location);

    ClassLoader getClassLoader();
}
