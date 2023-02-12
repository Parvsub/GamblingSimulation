package com.gamblersimulation;

import java.util.*;
public class GamblingSimulator {
    static int AmountOfStake=100;
    static int BetAmount=1;
    static int Won=1;
    static int Lost=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting amount of stake is "+AmountOfStake);
        System.out.println("Amount to bet after every play "+BetAmount);
        int play = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println("Gamblers play:"+play);
        int cashInHand = AmountOfStake;
        switch(play) {
            case 1:
                cashInHand = cashInHand + BetAmount;
                System.out.println("Total current cash gambler has "+cashInHand);
                break;
            case 0:
                cashInHand = cashInHand - BetAmount;
                System.out.println("Total current cash gambler has "+cashInHand);
                break;
            default:
                System.out.println("default");
        }
        if(play == 1) {
            System.out.println("Player won the first play");
        }
        else {
            System.out.println("Player lost the first play");
        }

    }

}