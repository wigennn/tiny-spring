package com.wigen.beans.factory;

/**
 * @author 18070900
 */
public interface PropertyValues {

    PropertyValue[] getPropertyValues();

    PropertyValue getPropertyValue(String propertyName);

    boolean contains(String propertyName);

    boolean isEmpty(String propertyName);

    PropertyValues addPropertyValues(PropertyValue propertyValue);
}
