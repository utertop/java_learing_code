package com.hp.day1;

public class Student {
    private String name;
    private int age;
    private boolean male;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void eat() {
        System.out.println("吃饭");
    }

    private void sleep() {
        System.out.println("睡觉");
    }

    protected static void study() {
        System.out.println("学习");
    }

    static void test() {
        System.out.println("测试");
    }
}
