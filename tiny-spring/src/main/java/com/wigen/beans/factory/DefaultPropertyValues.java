package com.wigen.beans.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 18070900
 */
public class DefaultPropertyValues implements PropertyValues {

    private final List<PropertyValue> list;

    public DefaultPropertyValues() {
        this.list = new ArrayList<>();
    }

    @Override
    public PropertyValue[] getPropertyValues() {
        return new PropertyValue[0];
    }

    @Override
    public PropertyValue getPropertyValue(String propertyName) {
        return null;
    }

    @Override
    public boolean contains(String propertyName) {
        return false;
    }

    @Override
    public boolean isEmpty(String propertyName) {
        return false;
    }

    @Override
    public DefaultPropertyValues addPropertyValues(PropertyValue propertyValue) {
        list.add(propertyValue);
        return this;
    }
}
