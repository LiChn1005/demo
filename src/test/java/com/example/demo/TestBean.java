package com.example.demo;

import com.example.demo.example.bean.MyBeanClass;
import com.example.demo.example.factorybean.Computer;
import com.example.demo.example.factorybean.ComputerFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @author lichangnan
 * @date 2024/8/7
 */
@Slf4j
@SpringBootTest
@AutoConfigureMockMvc
public class TestBean {
    private static final ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    public void test1() {
        MyBeanClass myBean = beanFactory.getBean("myBean", MyBeanClass.class);
        log.info("yetAnotherBeanClass = {}", myBean);

        log.info("custom tag = {} ", beanFactory.getBean("user1111"));
    }

    @Test
    public void test2() {
        Computer computer1 = beanFactory.getBean("computer", Computer.class);
        log.info("computer1 = {}", computer1);

        Computer computer2 = beanFactory.getBean("computer", Computer.class);
        log.info("computer2 = {} ", computer2);

        ComputerFactoryBean computer3 = beanFactory.getBean("&computer", ComputerFactoryBean.class);
        log.info("computer3 = {} type = {} info = {}", computer3.getObject(), computer3.getObjectType(), computer3.getComputerInfo());

        log.info("computer1 == computer2 {} {} {} {}", computer1 == computer2, System.identityHashCode(computer1), System.identityHashCode(computer2), System.identityHashCode(computer3.getObject()));
        log.info("computer1 == computer3 {}", computer1 == computer3.getObject());
        log.info("computer2 == computer3 {}", computer2 == computer3.getObject());

        Computer computer4 = beanFactory.getBean("computer", Computer.class);
        log.info("computer4 = {} {} ", computer4, System.identityHashCode(computer4));

        ComputerFactoryBean computer5 = beanFactory.getBean("&computer", ComputerFactoryBean.class);
        log.info("computer5 = {} {} ", computer5, System.identityHashCode(computer5));

    }
}
