package com.softserve.academy.homeworks.module3.kata;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean thereIsWinner = false;
        Fighter attacker;
        Fighter notAttacker;
        String winner="";
        if(fighter1.name.equals(firstAttacker)){
            attacker = fighter1;
            notAttacker = fighter2;
        }else{
            attacker = fighter2;
            notAttacker = fighter1;
        }
        while(!thereIsWinner){
            notAttacker.health = notAttacker.health - attacker.damagePerAttack;
            if (notAttacker.health <= 0){
                thereIsWinner = true;
                winner = attacker.name;
                System.out.printf("%s attacks %s; %s now has %d health and is dead. %s wins.",
                        attacker.name,
                        notAttacker.name,
                        notAttacker.name,
                        notAttacker.health,
                        attacker.name);
            }else {
                System.out.printf("%s attacks %s; %s now has %d health.",
                        attacker.name,
                        notAttacker.name,
                        notAttacker.name,
                        notAttacker.health);
            }
            Fighter changeFighter = notAttacker;
            notAttacker = attacker;
            attacker = changeFighter;
        }
        return winner;
    }
}
