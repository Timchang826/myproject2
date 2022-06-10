package com.tim.sales;

public class Customer {
    String name;
    int amount;
    float off = 0.1f;
    public Customer(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    public float backMoney(){
        return (amount/1000)*off*1000;
    }
    public void print(){
        System.out.println(name + "\t" + amount + "\t"+ (amount - backMoney()));
    }
}
