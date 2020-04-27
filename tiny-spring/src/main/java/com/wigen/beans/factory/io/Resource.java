package com.wigen.beans.factory.io;

import java.io.InputStream;

/**
 * @author 18070900
 */
public interface Resource {

    InputStream getInputStream() throws Exception;
}
