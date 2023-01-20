package com.company;

public class Main {

    public static void main(String[] args)
    {
        Soldier soldier=new Commander(new Sniper());

        soldier.basic();
        soldier.specific();
        soldier.setDuty(new Cover());
        soldier.fulfillDuty();
        soldier.reload();
        soldier.changeAmmo(new Enhanced());
        soldier.reload();

        System.out.println("Contact: ");
        Subject enemySoldier=new Enemy();
        enemySoldier.addSoldier(soldier);
        enemySoldier.getNoticed();

        System.out.println("-------------------------------------------");

        Soldier soldier1=new Stormtrooper();
        soldier1.basic();
        soldier1.specific();
        System.out.println("Activity:");
        soldier1.setDuty(new Share());
        soldier1.fulfillDuty();
        soldier1.reload();

        System.out.println("Contact: ");
        Subject enemySniper=new Enemy();
        enemySniper.addSoldier(soldier1);
        enemySniper.getNoticed();
    }
}
