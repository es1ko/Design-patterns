package com.company;

public class Ammo implements State
{
    public String ammoType;

    public Ammo(String ammoType)
    {
        this.ammoType=ammoType;
    }

    @Override
    public void reload() {
        System.out.println("Type: "+ammoType);
    }
}
