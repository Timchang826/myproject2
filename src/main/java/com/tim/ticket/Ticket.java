package com.tim.ticket;

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
        int diff = Math.abs(destination.id - start.id);
        switch (diff){
            case 100:
                return 500;
            case 200:
                return 600;
            case 300:
                return 1100;
        }
        return 0;
    }

    public void print(){
        System.out.println("normal ticket"+"\t"+start.name + " to " + destination.name + "\t" + amount + "\t"+ price()*amount);
    }


}
