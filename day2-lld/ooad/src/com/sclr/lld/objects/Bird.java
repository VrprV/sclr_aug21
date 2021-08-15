package com.sclr.lld.objects;

public abstract class Bird implements Sellable{
    protected String name;
    protected String color;
    protected int weight;

    abstract void fly();
}