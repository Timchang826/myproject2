package com.matt.ticket;

public class Ticket {
    Station start;
    Station destination;
    int amount;
    public Ticket(Station start, Station destination, int amount){
        this.start = start;
        this.destination = destination;
        this.amount = amount;
    }
    public float price(){
        int distance = destination.id - start.id;
        if(distance == 100 || distance == -100){
            return 600;
        }else if(distance == 200 || distance == -200){
            return 1500;
        }
        return 0;
    }
    public void print(){
        System.out.println(start.name + " to " + destination.name + "\t" + price()*amount);
    }


}
