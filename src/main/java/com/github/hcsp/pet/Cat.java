package com.github.hcsp.pet;

public class Cat {
    public String name;

    // 构造器
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
