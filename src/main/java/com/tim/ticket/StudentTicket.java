package com.tim.ticket;

public class StudentTicket extends Ticket{
    float off = 0.8f;
    public StudentTicket(Station start, Station destination, int amount){
        super(start, destination, amount);
    }
    @Override
    public float price(){
        int distance = destination.id - start.id;
        if(destination.id == 200 && start.id == 100|| start.id  == 200 && destination.id == 100){
            return 600*off;
        }else if(destination.id == 300 && start.id == 200|| start.id  == 300 && destination.id == 200){
            return 900*off;
        }else if(distance == 200 || distance == -200){
            return 1500*off;
        }
        return 0;
    }

    public void print(){
        System.out.println("student ticket"+"\t"+start.name + " to " + destination.name + "\t" + amount + "\t"+ price()*amount);
    }
}
