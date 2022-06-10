package com.tim.sales;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String name, int amount) {
        super(name, amount);
    }

    @Override
    public float backMoney(){
        return amount*off;
    }
    public void print() {
        System.out.println(name + "\t" + amount + "\t"+ (amount - backMoney()));
    }
}
