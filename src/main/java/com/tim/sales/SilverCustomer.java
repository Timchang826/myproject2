package com.tim.sales;

public class SilverCustomer extends Customer{
    public SilverCustomer(String name, int amount){
        super(name, amount);
    }
    @Override
    public void print(){
        System.out.println(name + "\t" + amount + "\t"+(amount - backMoney())+"("+backMoney()+")");
    }
}
