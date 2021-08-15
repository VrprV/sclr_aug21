package com.sclr.lld.objects;

public class Hen extends Bird{
    // private String name;
    // private String color;
    // private int weight;
    public Hen(String name, String color, int weight){
        this.name = name;
        this. color = color;
        this.weight = weight;
    }

    public void fly(){}

    public String getSellingPrice(){
        if (this.color.equalsIgnoreCase("black")){
            return this.name + " is sold at Rs. 1000" + " and it has wt :"+this.weight + " kg";
        }
        else if (this.color.equalsIgnoreCase("white")){
            return this.name + " is sold at Rs. 500 " + " and it has wt :"+this.weight + " kg";
        }
        return "None";
    }
}
