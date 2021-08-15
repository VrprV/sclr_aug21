package com.sclr.lld.objects;

public class Eagle extends Bird{
    public Eagle(String name, String color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void fly(){
        System.out.println("Fly high");
    }

    public String getSellingPrice(){
        return this.name + " is sold at Rs. 10000/- and it weighs :" + this.weight + " kg";
    }
}
