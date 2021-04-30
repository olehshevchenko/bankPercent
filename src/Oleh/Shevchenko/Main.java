package Oleh.Shevchenko;

import java.util.Scanner;

public class Main {
    public static final Scanner MONEYSCAN = new Scanner(System.in);
    public static final int MONTHINTHEYEAR = 12;

    public static void main(String[] args) {System.out.println("enter how much years you need calculate");
        int years = MONEYSCAN.nextInt();
        double totalMoney = calculatePercentByMonth() * years;
        System.out.println(totalMoney);
    }
    public static double calculatePercentByMonth() {
        System.out.println("enter how much money you need to put on bank account");
        double money = MONEYSCAN.nextInt();
        for (double i = 1; i <= MONTHINTHEYEAR; i++) {
            money = money * 0.015 + money;
        }
        return money;
    }
}
