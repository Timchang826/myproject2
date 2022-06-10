package com.tim.sales;

public class GoldCustomer extends SilverCustomer{
    public GoldCustomer(String name, int amount){
        super(name, amount);
        off = 0.2f;
    }
}
