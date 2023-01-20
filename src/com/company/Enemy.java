package com.company;

import java.util.List;
import java.util.ArrayList;

public class Enemy implements Subject
{
   public List<Observer> soldiers=new ArrayList<>();

    @Override
    public void addSoldier(Observer soldier) {
        soldiers.add(soldier);
    }
    @Override
    public void getNoticed() {
        System.out.println("The enemy is in an open position");
        for(Observer soldier:soldiers)
        {
            soldier.update();
        }
    }
}
