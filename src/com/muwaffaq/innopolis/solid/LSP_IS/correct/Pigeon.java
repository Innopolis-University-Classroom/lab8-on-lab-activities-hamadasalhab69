package com.muwaffaq.innopolis.solid.LSP_IS.correct;

public class Pigeon implements FlyingBird {
    
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }
}
