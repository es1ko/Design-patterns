package com.company;

public class Sniper  extends Soldier implements Observer
{
    @Override
    public void specific()
    {
        System.out.println("Sniper rifle");
    }

    @Override
    public void update() {
        System.out.println("Informing Commander");
    }
}
