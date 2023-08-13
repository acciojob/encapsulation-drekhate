package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        System.out.println(obj.name);
//        name has private access in com.driver.RWOnly
        obj.setName("Dipak");
        String name = obj.getName();
        System.out.println(name);
    }
  
}