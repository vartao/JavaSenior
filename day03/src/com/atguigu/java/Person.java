package com.atguigu.java;

/**
 * @author shkstart
 * @create 2019 上午 11:01
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person ("tao");
        Person p2 = new Person ("tao");
        System.out.println (p1.name == p2.name);
    }
}
