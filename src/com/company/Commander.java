package com.company;

public class Commander extends Decorator implements Observer{

    public Commander(Soldier soldier1) {
        super(soldier1);
    }

    public void Command() {
        System.out.println("Maintaining a positive team spirit");
    }

    @Override
    public void specific(){
        System.out.println("Colt");
        System.out.println("Activity:");
        Command();
    }

    @Override
    public void update() {
        System.out.println("Giving the order to eliminate the enemy");
    }
}
