package com.example.demo.example.bean;

/**
 * TODO
 *
 * @author lichangnan
 * @date 2024/8/7
 */
public class YetAnotherBeanClass {
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private String str;

    public MyBeanClass getMyBean() {
        return myBean;
    }

    public void setMyBean(MyBeanClass myBean) {
        this.myBean = myBean;
    }

    private MyBeanClass myBean;

    public YetAnotherBeanClass(String s, MyBeanClass myBeanClass) {
        myBean = myBeanClass;
        str = s;
    }

    @Override
    public String toString() {
        return "YetAnotherBeanClass{" +
                "str='" + str + '\'' +
                ", myBean=" + myBean +
                '}';
    }
}
