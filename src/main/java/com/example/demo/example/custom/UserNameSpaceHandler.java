package com.example.demo.example.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * TODO
 *
 * @author lichangnan
 * @date 2024/8/9
 */
public class UserNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
