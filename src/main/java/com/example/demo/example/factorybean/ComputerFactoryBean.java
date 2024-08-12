package com.example.demo.example.factorybean;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.StringUtils;

/**
 * TODO
 *
 * @author lichangnan
 * @date 2024/8/9
 */
@Data
public class ComputerFactoryBean implements FactoryBean<Computer> {

    private String computerInfo;

    @Override
    public Computer getObject() {
        if (!StringUtils.hasText(computerInfo)) return null;
        String[] arg = computerInfo.split(";");
        return new Computer(arg[0], arg[1]);
    }

    @Override
    public Class<Computer> getObjectType() {
        return Computer.class;
    }
}
