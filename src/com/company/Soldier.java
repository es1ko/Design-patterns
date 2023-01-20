package com.company;

public abstract class Soldier implements Observer
{
    public void basic()
    {
        System.out.println("Inventory:\nKevlar helmet, rucksack, battle dress");
    }

    public abstract void specific();

    Duty duty;

    public void setDuty(Duty duty)
    {
        this.duty=duty;
    }

    public void fulfillDuty()
    {
        duty.fulfill();
    }

    public State currentAmmo;

    public Soldier()
    {
        currentAmmo= new Regular();
    }

    public void changeAmmo(State newAmmo)
    {
        this.currentAmmo=newAmmo;
    }

    public void reload()
    {
        currentAmmo.reload();
    }
}
