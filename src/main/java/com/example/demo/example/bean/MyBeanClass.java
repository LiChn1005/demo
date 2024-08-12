package com.example.demo.example.bean;

/**
 * TODO
 *
 * @author lichangnan
 * @date 2024/8/7
 */
public class MyBeanClass {
    private int num;
    private String str;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "MyBeanClass{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }
}
