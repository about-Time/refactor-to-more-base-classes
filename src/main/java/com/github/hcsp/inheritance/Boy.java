package com.github.hcsp.inheritance;

public class Boy {
    private int age;

    //这里我想用组合的方式 先用sayMyName这个函数试试
    SayName sayName;

    public void sayMyName() {
        sayName.sayMyName();
    }

    //因为我把name放进了sayName里面，这样调用就有空指针的问题了，用了if判断也不对
    //这个如果使用继承的话可以用super语法，但是用组合又该怎么处理呢？
    public Boy(String name, int age) {
        sayName.name = name;
        this.age = age;
    }


    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }

    public void sayBoy() {
        System.out.println("我是一个男孩");
    }
}
