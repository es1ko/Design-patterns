package com.company;

public class Stormtrooper extends Soldier implements Observer
{
    @Override
    public void specific()
    {
     System.out.println("Assault rifle");
    }

    @Override
    public void update() {
        System.out.println("Informing Commander");
    }
}
