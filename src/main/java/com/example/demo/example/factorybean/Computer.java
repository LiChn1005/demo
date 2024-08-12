package com.example.demo.example.factorybean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * TODO
 *
 * @author lichangnan
 * @date 2024/8/9
 */
@Data
@AllArgsConstructor
public class Computer {
    private String name;
    private String price;
    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
