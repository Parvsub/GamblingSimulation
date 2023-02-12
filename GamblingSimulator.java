package com.gamblersimulation;

import java.util.*;
public class GamblingSimulator {
    static int AmountOfStake=100;
    static int TotalAmountDifferenceInMonth=0;
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

            }
            if(cashInHand==150 || cashInHand==50) {
                System.out.println("Player would like to resign for current day"+i);
            }
            if(cashInHand > 100) {
                int amountWonPerDay = cashInHand - AmountOfStake;
                System.out.println("Player won day"+i+" RS "+amountWonPerDay);
            }
            else if(cashInHand < 100){
                int amountLostPerDay = AmountOfStake - cashInHand;
                System.out.println("Player lost day"+i+" RS "+amountLostPerDay);

            }
            if(cashInHand == 150) {
                System.out.println("Day"+i+" is gamblers Luckiest day as he won maximum amount "+cashInHand+" RS");
            }
            else if (cashInHand == 50) {
                System.out.println("Day"+i+" is gamblers Unluckiest day as he lost maximum amount "+cashInHand+" RS");
            }
            TotalAmount = TotalAmount + cashInHand;
        }
        System.out.println("Total amount player has after 20 days as per day included = "+TotalAmount+" $");
        TotalAmountDifferenceInMonth = TotalAmount - AmountOfStake * 20;
        if(TotalAmountDifferenceInMonth > 0) {
            System.out.println("Total cash gambler won "+TotalAmountDifferenceInMonth+" $");
        }
        else {
            System.out.println("Total cash gambler lost in that month "+TotalAmountDifferenceInMonth+" $");
        }
    }
}