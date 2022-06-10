package com.tim.sales;


import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 2000);
        GoldCustomer c4 = new GoldCustomer("0004", 5000);
        DiscountCustomer c5 = new DiscountCustomer("0005", 900);
        PlatinumCustomer c6 = new PlatinumCustomer("0006", 900);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        for(Customer c : list){
            c.print();
        }

    }
}
