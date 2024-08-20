package com.example.demo.example.bean;

/**
 * 这是一个bean
 *
 * @author lichangnan
 * @date 2024/8/7
 */
public class AnotherBeanClass {
    private String someProperty;

    public String getSomeProperty() {
        return someProperty;
    }

    public void setSomeProperty(String someProperty) {
        this.someProperty = someProperty;
    }

    @Override
    public String toString() {
        return "AnotherBeanClass{" +
                "someProperty='" + someProperty + '\'' +
                '}';
    }
}
