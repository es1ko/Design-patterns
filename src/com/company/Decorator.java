package com.company;

public class Decorator extends Soldier{
    Soldier soldier1;

    public Decorator(Soldier soldier1)
    {
        this.soldier1=soldier1;
    }

    @Override
    public void specific() {
        soldier1.fulfillDuty();
    }

    @Override
    public void update() {
    }
}
