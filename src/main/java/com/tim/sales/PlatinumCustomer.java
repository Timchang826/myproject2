package com.tim.sales;

public class PlatinumCustomer extends DiscountCustomer{
    public PlatinumCustomer(String name, int amount) {
        super(name, amount);
        off = 0.3f;
    }
    @Override
    public void print() {
        System.out.println(name + "\t" + amount + "\t"+ (amount - backMoney()) + "(" + amount*0.2 + ")");
    }
}
