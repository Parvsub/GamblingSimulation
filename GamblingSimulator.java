package com.gamblersimulation;

import java.util.*;
public class GamblingSimulator {
    static int AmountOfStake=100;
    static int BetAmount=1;
    static int Won=1;
    static int Lost=0;
    static int TotalAmount=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting amount of stake is "+AmountOfStake);
        System.out.println("Amount to bet after every play "+BetAmount);
        for (int i = 1; i <= 20; i++) {
            int cashInHand = AmountOfStake;
            while(cashInHand > 50 && cashInHand < 150) {
                int play = (int) Math.floor(Math.random() * 10) % 2;
                System.out.println("Gamblers play:"+play);

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
                    System.out.println("Player won the current play");
                }
                else {
                    System.out.println("Player lost the current play");
                }

            }
            if(cashInHand==150 || cashInHand==50) {
                System.out.println("Player would like to resign for current day"+i);

            }
            TotalAmount = TotalAmount + cashInHand;
        }
        System.out.println("Total amount player has after 20 days as per day included = "+TotalAmount+" $");
    }
}